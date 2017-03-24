package com.softgroup.common.token.impl.configuration;

import com.softgroup.common.token.api.TokenFactory;
import com.softgroup.common.token.impl.TokenFactoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class TokenAppCfg {

    @Bean
    public TokenFactory token() {
        return new TokenFactoryImpl();
    }

}
