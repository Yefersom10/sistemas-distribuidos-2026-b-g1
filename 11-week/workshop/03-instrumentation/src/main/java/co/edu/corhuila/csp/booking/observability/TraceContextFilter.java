package co.edu.corhuila.csp.booking.observability;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import org.slf4j.MDC;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.HandlerMapping;

/**
 * First filter of every request: reads {@code traceparent} (or starts a trace), opens this
 * service's span, exposes both ids to the logger and returns the header in the response.
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class TraceContextFilter extends OncePerRequestFilter {

    public static final String TRACEPARENT = "traceparent";
    public static final String CORRELATION_HEADER = "X-Correlation-Id";
    public static final String CONTEXT_ATTRIBUTE = "traceContext";

    private final MetricsRegistry metrics;

    public TraceContextFilter(MetricsRegistry metrics) {
        this.metrics = metrics;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        TraceContext context = TraceContext.parse(request.getHeader(TRACEPARENT))
                .orElseGet(TraceContext::newRoot)
                .child();
        String correlationId = correlationIdOf(request.getHeader(CORRELATION_HEADER));
        request.setAttribute(CONTEXT_ATTRIBUTE, context);
        response.setHeader(TRACEPARENT, context.toHeader());
        response.setHeader(CORRELATION_HEADER, correlationId);
        MDC.put(StructuredLogger.TRACE_ID, context.traceId());
        MDC.put(StructuredLogger.SPAN_ID, context.spanId());
        MDC.put(StructuredLogger.CORRELATION_ID, correlationId);
        long started = System.nanoTime();
        try {
            chain.doFilter(request, response);
        } finally {
            long elapsedNanos = System.nanoTime() - started;
            metrics.record(routeOf(request), response.getStatus(), elapsedNanos / 1_000_000_000.0);
            StructuredLogger.info("http.request.completed", request.getMethod() + " " + request.getRequestURI(),
                    elapsedNanos / 1_000_000, Map.of("http_status", response.getStatus()));
            MDC.clear();
        }
    }

    /** The mapped pattern, so the label stays bounded; unmapped paths share one value. */
    private static String routeOf(HttpServletRequest request) {
        Object pattern = request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE);
        return pattern != null ? pattern.toString() : "unmatched";
    }

    private static String correlationIdOf(String received) {
        return received != null && !received.isBlank() ? received : UUID.randomUUID().toString();
    }
}
