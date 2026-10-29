package co.edu.corhuila.csp.booking.adapter.in.http;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Negative authorization test of the story "Internal workflow routes accept only genuine service tokens"
 * (threat E of the boundary API Gateway to Booking, 05-architecture/security/stride-yefersom10.md).
 * A token that names {@code csp-workflow} as its {@code sub} but was not signed by the identity service
 * never reaches {@code /internal/workflow/holds}.
 */
class ForgedWorkflowTokenAuthzTest {

    private static final String WORKFLOW_SUB = "csp-workflow";
    private static final String HS256_SECRET = "01234567890123456789012345678901";

    private MockMvc mockMvc;
    private RSAPrivateKey attackerKey;

    @BeforeEach
    void setUp() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        KeyPair identityService = generator.generateKeyPair();
        this.attackerKey = (RSAPrivateKey) generator.generateKeyPair().getPrivate();
        JwtAuthenticationFilter filter = new JwtAuthenticationFilter(
                (RSAPublicKey) identityService.getPublic(), new ObjectMapper(),
                Set.of("csp-worker"), Set.of(WORKFLOW_SUB));
        this.mockMvc = MockMvcBuilders.standaloneSetup(new WorkflowProbe())
                .addFilters(new CorrelationIdFilter(), filter)
                .build();
    }

    @Test
    void aWorkflowSubjectSignedWithAnAttackerKeyReceivesUnauthorized() throws Exception {
        SignedJWT jwt = new SignedJWT(new JWSHeader(JWSAlgorithm.RS256), claims());
        jwt.sign(new RSASSASigner(attackerKey));

        mockMvc.perform(get("/internal/workflow/holds")
                        .header(JwtAuthenticationFilter.AUTHORIZATION_HEADER, "Bearer " + jwt.serialize()))
                .andExpect(status().isUnauthorized())
                .andExpect(jsonPath("$.error").value("INVALID_TOKEN"));
    }

    @Test
    void aWorkflowSubjectSignedWithASharedSecretReceivesUnauthorized() throws Exception {
        SignedJWT jwt = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claims());
        jwt.sign(new MACSigner(HS256_SECRET.getBytes()));

        mockMvc.perform(get("/internal/workflow/holds")
                        .header(JwtAuthenticationFilter.AUTHORIZATION_HEADER, "Bearer " + jwt.serialize()))
                .andExpect(status().isUnauthorized())
                .andExpect(jsonPath("$.error").value("INVALID_TOKEN"));
    }

    @Test
    void aWorkflowRouteWithoutTokenReceivesUnauthorized() throws Exception {
        mockMvc.perform(get("/internal/workflow/holds"))
                .andExpect(status().isUnauthorized())
                .andExpect(jsonPath("$.error").value("UNAUTHORIZED"));
    }

    private static JWTClaimsSet claims() throws JOSEException {
        return new JWTClaimsSet.Builder()
                .subject(WORKFLOW_SUB)
                .expirationTime(new Date(System.currentTimeMillis() + 60_000))
                .build();
    }

    @RestController
    static class WorkflowProbe {

        @GetMapping("/internal/workflow/holds")
        String hold() {
            return "held";
        }
    }
}
