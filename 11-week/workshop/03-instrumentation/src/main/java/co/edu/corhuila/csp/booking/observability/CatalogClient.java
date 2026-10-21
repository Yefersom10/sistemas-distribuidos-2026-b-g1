package co.edu.corhuila.csp.booking.observability;

import java.time.Duration;
import java.util.Map;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

/** Outgoing call of the hold journey (DEC-006): asks Catalog for the showtime and forwards the trace. */
@Component
public class CatalogClient {

    private final RestClient http;

    public CatalogClient(@Value("${catalog.base-url:http://localhost:8082/api/v1/catalog}") String baseUrl) {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(Duration.ofSeconds(3));
        this.http = RestClient.builder().baseUrl(baseUrl).requestFactory(factory).build();
    }

    /** Calls {@code GET /showtimes/{id}/availability} inside a new span of the incoming trace. */
    public String availability(String showtimeId, TraceContext current) {
        TraceContext outgoing = current.child();
        Map<String, Object> fields = Map.of("showtime_id", showtimeId);
        StructuredLogger.info("catalog.availability.requested", "asking Catalog for showtime availability", 0, fields);
        long started = System.nanoTime();
        String body = http.get()
                .uri("/showtimes/{id}/availability", showtimeId)
                .header(TraceContextFilter.TRACEPARENT, outgoing.toHeader())
                .header(TraceContextFilter.CORRELATION_HEADER, MDC.get(StructuredLogger.CORRELATION_ID))
                .retrieve()
                .body(String.class);
        StructuredLogger.info("catalog.availability.received", "Catalog answered with the showtime snapshot",
                (System.nanoTime() - started) / 1_000_000, fields);
        return body;
    }
}
