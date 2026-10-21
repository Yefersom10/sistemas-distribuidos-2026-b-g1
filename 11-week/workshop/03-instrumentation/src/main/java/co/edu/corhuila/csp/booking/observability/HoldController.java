package co.edu.corhuila.csp.booking.observability;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

/** First hops of {@code POST /holds}: it only calls Catalog; the PostgreSQL transaction is out of scope here. */
@RestController
class HoldController {

    private final CatalogClient catalog;

    HoldController(CatalogClient catalog) {
        this.catalog = catalog;
    }

    @PostMapping("/api/v1/booking/holds")
    ResponseEntity<Map<String, String>> createHold(
            @RequestBody Map<String, String> request,
            @RequestAttribute(TraceContextFilter.CONTEXT_ATTRIBUTE) TraceContext context) {
        String showtimeId = request.get("showtimeId");
        try {
            catalog.availability(showtimeId, context);
            return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("status", "HELD"));
        } catch (RestClientException e) {
            StructuredLogger.error("hold.failed", "hold not created, Catalog unavailable", 0,
                    Map.of("http_status", 503, "error_code", "SERVICE_UNAVAILABLE"));
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(Map.of("error", "SERVICE_UNAVAILABLE"));
        }
    }
}
