package co.edu.corhuila.csp.booking.observability;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TraceContextFilterTest {

    private static final String HEALTH = "/api/v1/booking/health";
    private static final String TRACE_ID = "4bf92f3577b34da6a3ce929d0e0e4736";

    @Autowired
    private TestRestTemplate http;

    @Test
    void answersWithTheTraceIdItReceivedAndANewSpan() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("traceparent", "00-" + TRACE_ID + "-00f067aa0ba902b7-01");

        ResponseEntity<String> response = http.exchange(HEALTH, HttpMethod.GET, new HttpEntity<>(headers), String.class);

        TraceContext answered = TraceContext.parse(response.getHeaders().getFirst("traceparent")).orElseThrow();
        assertThat(answered.traceId()).isEqualTo(TRACE_ID);
        assertThat(answered.spanId()).isNotEqualTo("00f067aa0ba902b7");
    }

    @Test
    void startsATraceWhenTheRequestHasNone() {
        ResponseEntity<String> response = http.getForEntity(HEALTH, String.class);

        assertThat(TraceContext.parse(response.getHeaders().getFirst("traceparent"))).isPresent();
        assertThat(response.getHeaders().getFirst("X-Correlation-Id")).isNotBlank();
    }
}
