package co.edu.corhuila.csp.booking.observability;

import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import org.slf4j.MDC;

/** Writes one JSON line per event with the common fields of 02-log-contract.md. */
public final class StructuredLogger {

    static final String TRACE_ID = "trace_id";
    static final String SPAN_ID = "span_id";
    static final String CORRELATION_ID = "correlation_id";

    private static final DateTimeFormatter TIMESTAMP =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZone(ZoneOffset.UTC);

    private StructuredLogger() {
    }

    public static void info(String event, String message, long durationMs, Map<String, Object> fields) {
        write("INFO", event, message, durationMs, fields);
    }

    public static void error(String event, String message, long durationMs, Map<String, Object> fields) {
        write("ERROR", event, message, durationMs, fields);
    }

    private static void write(String level, String event, String message, long durationMs, Map<String, Object> fields) {
        Map<String, Object> line = new LinkedHashMap<>();
        line.put("timestamp", TIMESTAMP.format(Instant.now()));
        line.put("level", level);
        line.put("service", "booking-service");
        line.put("version", System.getenv().getOrDefault("SERVICE_VERSION", "0.1.0"));
        line.put("environment", System.getenv().getOrDefault("ENVIRONMENT", "dev"));
        line.put(TRACE_ID, MDC.get(TRACE_ID));
        line.put(SPAN_ID, MDC.get(SPAN_ID));
        line.put(CORRELATION_ID, MDC.get(CORRELATION_ID));
        line.put("event", event);
        line.put("message", message);
        line.put("duration_ms", durationMs);
        line.putAll(fields);
        System.out.println(toJson(line));
    }

    private static String toJson(Map<String, Object> line) {
        StringBuilder json = new StringBuilder("{");
        line.forEach((key, value) -> {
            if (json.length() > 1) {
                json.append(',');
            }
            json.append(quote(key)).append(':');
            json.append(value instanceof Number ? value.toString() : quote(String.valueOf(value)));
        });
        return json.append('}').toString();
    }

    private static String quote(String text) {
        return "\"" + text.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n") + "\"";
    }
}
