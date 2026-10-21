package co.edu.corhuila.csp.booking.observability;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MetricsRegistryTest {

    @Test
    void countsRequestsPerOutcome() {
        MetricsRegistry metrics = new MetricsRegistry();

        metrics.record("/api/v1/booking/holds", 201, 0.04);
        metrics.record("/api/v1/booking/holds", 422, 0.09);
        metrics.record("/api/v1/booking/holds", 503, 3.0);

        String text = metrics.render();
        assertThat(text).contains("booking_requests_total{route=\"/api/v1/booking/holds\",outcome=\"success\"} 1");
        assertThat(text).contains("booking_requests_total{route=\"/api/v1/booking/holds\",outcome=\"client_error\"} 1");
        assertThat(text).contains("booking_requests_total{route=\"/api/v1/booking/holds\",outcome=\"server_error\"} 1");
    }

    @Test
    void fillsTheCumulativeLatencyBuckets() {
        MetricsRegistry metrics = new MetricsRegistry();

        metrics.record("/api/v1/booking/holds", 201, 0.04);
        metrics.record("/api/v1/booking/holds", 201, 0.2);
        metrics.record("/api/v1/booking/holds", 503, 3.0);

        String text = metrics.render();
        assertThat(text).contains("duration_seconds_bucket{route=\"/api/v1/booking/holds\",le=\"0.05\"} 1");
        assertThat(text).contains("duration_seconds_bucket{route=\"/api/v1/booking/holds\",le=\"0.25\"} 2");
        assertThat(text).contains("duration_seconds_bucket{route=\"/api/v1/booking/holds\",le=\"2.5\"} 2");
        assertThat(text).contains("duration_seconds_bucket{route=\"/api/v1/booking/holds\",le=\"+Inf\"} 3");
        assertThat(text).contains("duration_seconds_count{route=\"/api/v1/booking/holds\"} 3");
    }
}
