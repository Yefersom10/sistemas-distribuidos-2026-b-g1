package co.edu.corhuila.csp.booking.observability;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TraceContextTest {

    private static final String HEADER = "00-4bf92f3577b34da6a3ce929d0e0e4736-00f067aa0ba902b7-01";

    @Test
    void parsesAValidTraceparent() {
        TraceContext context = TraceContext.parse(HEADER).orElseThrow();

        assertThat(context.traceId()).isEqualTo("4bf92f3577b34da6a3ce929d0e0e4736");
        assertThat(context.spanId()).isEqualTo("00f067aa0ba902b7");
        assertThat(context.toHeader()).isEqualTo(HEADER);
    }

    @Test
    void rejectsMalformedAndZeroedHeaders() {
        assertThat(TraceContext.parse(null)).isEmpty();
        assertThat(TraceContext.parse("not-a-traceparent")).isEmpty();
        assertThat(TraceContext.parse("00-" + "0".repeat(32) + "-00f067aa0ba902b7-01")).isEmpty();
    }

    @Test
    void childKeepsTheTraceAndChangesTheSpan() {
        TraceContext parent = TraceContext.parse(HEADER).orElseThrow();
        TraceContext child = parent.child();

        assertThat(child.traceId()).isEqualTo(parent.traceId());
        assertThat(child.spanId()).isNotEqualTo(parent.spanId()).hasSize(16);
    }
}
