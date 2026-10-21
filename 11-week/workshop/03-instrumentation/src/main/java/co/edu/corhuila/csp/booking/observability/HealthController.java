package co.edu.corhuila.csp.booking.observability;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Liveness only, without dependencies, as DEC-005 defines it for the real service. */
@RestController
class HealthController {

    @GetMapping("/api/v1/booking/health")
    Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
