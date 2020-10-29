package io.github.fallingyang.uaa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @author yangzifeng
 */
@Configuration
@EnableAuthorizationServer
public class UaaSecurityConfiguration extends AuthorizationServerConfigurerAdapter {

    private final AuthenticationManager authenticationManager;

    private ClientDetailsService clientDetailsService;

    @Autowired
    public UaaSecurityConfiguration(AuthenticationManager authenticationManager, @Qualifier("customClientDetailsService") ClientDetailsService clientDetailsService) {
        this.authenticationManager = authenticationManager;
        this.clientDetailsService = clientDetailsService;
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(clientDetailsService);
//        clients.inMemory()
//                .withClient("client2").secret(passwordEncoder.encode("123456"))
//                .authorizedGrantTypes("authorization_code", "refresh_token")
//                .redirectUris("http://localhost:8082/client2/login")
//                .scopes("email", "profile")
//                .autoApprove(true)
//                .and()
//                .withClient("client3").secret(passwordEncoder.encode("123456"))
//                .authorizedGrantTypes("authorization_code", "refresh_token")
//                .redirectUris("http://localhost:8083/client3/login")
//                .scopes("email", "profile")
//                .autoApprove(true)
//                .and()
//                .withClient("web_app")
//                .secret(passwordEncoder.encode("changeit"))
//                .scopes("openid")
//                .autoApprove(true)
//                .authorizedGrantTypes("implicit","refresh_token", "password", "authorization_code")
//                .accessTokenValiditySeconds(300)
//                .refreshTokenValiditySeconds(604800)
//                .and()
//                .withClient("internal")
//                .secret(passwordEncoder.encode("internal"))
//                .scopes("web-app")
//                .autoApprove(true)
//                .authorizedGrantTypes("client_credentials")
//                .accessTokenValiditySeconds(1800)
//                .refreshTokenValiditySeconds(2592000);

    }

    /**
     * 配置OAuth端点使用WebSecurity配置的authenticationManager
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        endpoints.authenticationManager(authenticationManager)
                .tokenStore(tokenStore())
                .accessTokenConverter(jwtAccessTokenConverter())
                .reuseRefreshTokens(false);
    }

    /**
     * 配置OAuth端点的权限
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) {
        security.tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");
    }

    @Bean
    public JwtTokenStore tokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        converter.setSigningKey("123456");
        return converter;
    }
}
