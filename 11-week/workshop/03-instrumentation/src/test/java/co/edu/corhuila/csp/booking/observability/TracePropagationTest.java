package co.edu.corhuila.csp.booking.observability;

import static org.assertj.core.api.Assertions.assertThat;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TracePropagationTest {

    private static final String TRACE_ID = "4bf92f3577b34da6a3ce929d0e0e4736";
    private static final AtomicReference<String> receivedByCatalog = new AtomicReference<>();
    private static HttpServer catalogStub;

    @Autowired
    private TestRestTemplate http;

    @BeforeAll
    static void startCatalogStub() throws Exception {
        catalogStub = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        catalogStub.createContext("/", exchange -> {
            receivedByCatalog.set(exchange.getRequestHeaders().getFirst("traceparent"));
            exchange.sendResponseHeaders(200, -1);
            exchange.close();
        });
        catalogStub.start();
    }

    @AfterAll
    static void stopCatalogStub() {
        catalogStub.stop(0);
    }

    @DynamicPropertySource
    static void catalogUrl(DynamicPropertyRegistry registry) {
        registry.add("catalog.base-url", () -> "http://localhost:" + catalogStub.getAddress().getPort());
    }

    @Test
    void catalogReceivesTheTraceIdSentToTheHoldEndpoint() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("traceparent", "00-" + TRACE_ID + "-00f067aa0ba902b7-01");

        ResponseEntity<String> response = http.postForEntity("/api/v1/booking/holds",
                new HttpEntity<>("{\"showtimeId\":\"a31f0b6e-5d2c-4c43-8a77-2f6a9c1d0e55\"}", headers), String.class);

        TraceContext downstream = TraceContext.parse(receivedByCatalog.get()).orElseThrow();
        assertThat(response.getStatusCode().value()).isEqualTo(201);
        assertThat(downstream.traceId()).isEqualTo(TRACE_ID);
        assertThat(downstream.spanId()).isNotEqualTo("00f067aa0ba902b7");
    }
}
