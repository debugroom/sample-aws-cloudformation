package org.debugroom.sample.cloudformation.backend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("org.debugroom.sample.cloudformation.backend.domain.service")
@Configuration
public class DomainConfig {
}
