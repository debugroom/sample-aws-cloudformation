package org.debugroom.sample.cloudformation.bff.config;

import org.debugroom.sample.cloudformation.common.apinfra.interceptor.MDCLoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestOperations;

import org.debugroom.sample.cloudformation.bff.domain.ServiceProperties;

@Configuration
@ComponentScan("org.debugroom.sample.cloudformation.bff.domain")
public class DomainConfig {

    @Autowired
    ServiceProperties properties;

    @Bean
    public RestOperations restOperations(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.rootUri(properties.getDns())
                .interceptors(new MDCLoggingInterceptor()).build();
    }

}
