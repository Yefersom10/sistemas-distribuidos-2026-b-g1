package co.edu.corhuila.csp.booking.observability;

import java.util.Map;
import java.util.TreeMap;
import org.springframework.stereotype.Component;

/**
 * Two Prometheus metrics of the hold journey, kept in memory: a counter of requests per
 * outcome and a latency histogram. Labels are bounded: {@code route} is the mapped pattern,
 * never the raw URL, and {@code outcome} has three values.
 */
@Component
public class MetricsRegistry {

    static final double[] BUCKETS = {0.05, 0.1, 0.25, 0.5, 1, 2.5};

    private final Map<String, Long> requests = new TreeMap<>();
    private final Map<String, long[]> latencyBuckets = new TreeMap<>();
    private final Map<String, Double> latencySum = new TreeMap<>();

    public synchronized void record(String route, int status, double seconds) {
        requests.merge(route + "|" + outcomeOf(status), 1L, Long::sum);
        long[] buckets = latencyBuckets.computeIfAbsent(route, key -> new long[BUCKETS.length + 1]);
        for (int i = 0; i < BUCKETS.length; i++) {
            if (seconds <= BUCKETS[i]) {
                buckets[i]++;
            }
        }
        buckets[BUCKETS.length]++;
        latencySum.merge(route, seconds, Double::sum);
    }

    public synchronized String render() {
        StringBuilder text = new StringBuilder("# TYPE booking_requests_total counter\n");
        requests.forEach((key, count) -> {
            String[] parts = key.split("\\|");
            text.append("booking_requests_total{route=\"%s\",outcome=\"%s\"} %d\n".formatted(parts[0], parts[1], count));
        });
        text.append("# TYPE booking_request_duration_seconds histogram\n");
        latencyBuckets.forEach((route, buckets) -> {
            for (int i = 0; i < BUCKETS.length; i++) {
                text.append("booking_request_duration_seconds_bucket{route=\"%s\",le=\"%s\"} %d\n"
                        .formatted(route, BUCKETS[i], buckets[i]));
            }
            long total = buckets[BUCKETS.length];
            text.append("booking_request_duration_seconds_bucket{route=\"%s\",le=\"+Inf\"} %d\n".formatted(route, total));
            text.append("booking_request_duration_seconds_sum{route=\"%s\"} %s\n".formatted(route, latencySum.get(route)));
            text.append("booking_request_duration_seconds_count{route=\"%s\"} %d\n".formatted(route, total));
        });
        return text.toString();
    }

    private static String outcomeOf(int status) {
        return status >= 500 ? "server_error" : status >= 400 ? "client_error" : "success";
    }
}
