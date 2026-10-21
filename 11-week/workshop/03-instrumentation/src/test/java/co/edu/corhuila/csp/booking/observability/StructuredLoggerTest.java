package co.edu.corhuila.csp.booking.observability;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

class StructuredLoggerTest {

    private final PrintStream original = System.out;
    private final ByteArrayOutputStream captured = new ByteArrayOutputStream();

    @AfterEach
    void restoreOutput() {
        System.setOut(original);
        MDC.clear();
    }

    @Test
    void writesTheCommonFieldsOfTheLogContract() throws Exception {
        System.setOut(new PrintStream(captured, true));
        MDC.put("trace_id", "4bf92f3577b34da6a3ce929d0e0e4736");
        MDC.put("span_id", "00f067aa0ba902b7");
        MDC.put("correlation_id", "0c5b1a52-6f0e-4f43-9a35-2d0f6a0e7b11");

        StructuredLogger.error("catalog.availability.timeout", "catalog-service did not answer", 3004,
                Map.of("showtime_id", "a31f0b6e"));

        JsonNode line = new ObjectMapper().readTree(captured.toString().trim());
        assertThat(line.get("level").asText()).isEqualTo("ERROR");
        assertThat(line.get("service").asText()).isEqualTo("booking-service");
        assertThat(line.get("trace_id").asText()).isEqualTo("4bf92f3577b34da6a3ce929d0e0e4736");
        assertThat(line.get("span_id").asText()).isEqualTo("00f067aa0ba902b7");
        assertThat(line.get("event").asText()).isEqualTo("catalog.availability.timeout");
        assertThat(line.get("duration_ms").asLong()).isEqualTo(3004);
        assertThat(line.get("showtime_id").asText()).isEqualTo("a31f0b6e");
        assertThat(line.get("timestamp").asText()).matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}Z");
    }
}
