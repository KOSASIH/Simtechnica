package com.kosasih.simtechnica.client;

import com.kosasih.simtechnica.security.oauth2.AuthorizationHeaderUtil;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class OAuth2InterceptedFeignConfiguration {

    @Bean(name = "oauth2RequestInterceptor")
    public RequestInterceptor getOAuth2RequestInterceptor(AuthorizationHeaderUtil authorizationHeaderUtil) {
        return new TokenRelayRequestInterceptor(authorizationHeaderUtil);
    }
}
