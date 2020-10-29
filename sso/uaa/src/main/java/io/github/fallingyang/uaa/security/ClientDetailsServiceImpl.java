package io.github.fallingyang.uaa.security;

import io.github.fallingyang.uaa.domain.client.service.HandingFetchClient;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yangzifeng
 */
@Component("customClientDetailsService")
public class ClientDetailsServiceImpl implements ClientDetailsService {

    private HandingFetchClient handingFetchClient;

    public ClientDetailsServiceImpl(HandingFetchClient handingFetchClient) {
        this.handingFetchClient = handingFetchClient;
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories
                .createDelegatingPasswordEncoder();
        return handingFetchClient.getClientById(clientId).map(
                client -> {
                    BaseClientDetails baseClientDetails = new BaseClientDetails("client2","","email","authorization_code","ROLE_USER","http://localhost:8082/client2/login");
                    Set<String> autoApproveScopes = new HashSet<>();
                    autoApproveScopes.add("email");
                    baseClientDetails.setAutoApproveScopes(autoApproveScopes);
                    baseClientDetails.setClientSecret(passwordEncoder.encode("123456"));
                    return baseClientDetails;
                }
        ).orElseThrow(() -> new ClientRegistrationException("can't find client detail"));
    }
}
