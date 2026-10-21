package co.edu.corhuila.csp.booking.observability;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MetricsController {

    private final MetricsRegistry metrics;

    MetricsController(MetricsRegistry metrics) {
        this.metrics = metrics;
    }

    @GetMapping(value = "/metrics", produces = "text/plain;version=0.0.4")
    String metrics() {
        return metrics.render();
    }
}
