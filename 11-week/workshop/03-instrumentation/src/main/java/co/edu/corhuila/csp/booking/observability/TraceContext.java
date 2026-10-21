package co.edu.corhuila.csp.booking.observability;

import java.security.SecureRandom;
import java.util.HexFormat;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** W3C trace context of one hop: the trace id is shared by every service, the span id is per hop. */
public record TraceContext(String traceId, String spanId) {

    private static final Pattern TRACEPARENT = Pattern.compile("00-([0-9a-f]{32})-([0-9a-f]{16})-[0-9a-f]{2}");
    private static final SecureRandom RANDOM = new SecureRandom();

    /** The context of a valid {@code traceparent} header; empty when it is missing or malformed. */
    public static Optional<TraceContext> parse(String header) {
        if (header == null) {
            return Optional.empty();
        }
        Matcher matcher = TRACEPARENT.matcher(header.trim());
        if (!matcher.matches() || isZero(matcher.group(1)) || isZero(matcher.group(2))) {
            return Optional.empty();
        }
        return Optional.of(new TraceContext(matcher.group(1), matcher.group(2)));
    }

    public static TraceContext newRoot() {
        return new TraceContext(randomHex(16), randomHex(8));
    }

    /** Same trace, new span: what this service sends downstream or uses for its own work. */
    public TraceContext child() {
        return new TraceContext(traceId, randomHex(8));
    }

    public String toHeader() {
        return "00-" + traceId + "-" + spanId + "-01";
    }

    private static boolean isZero(String hex) {
        return hex.chars().allMatch(c -> c == '0');
    }

    private static String randomHex(int bytes) {
        byte[] value = new byte[bytes];
        do {
            RANDOM.nextBytes(value);
        } while (isZero(HexFormat.of().formatHex(value)));
        return HexFormat.of().formatHex(value);
    }
}
