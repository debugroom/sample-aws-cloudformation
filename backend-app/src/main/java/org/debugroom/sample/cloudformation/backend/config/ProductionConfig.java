package org.debugroom.sample.cloudformation.backend.config;

import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("production")
@EnableRdsInstance(
        dbInstanceIdentifier = "${rds.idetifier}",
        password = "${rds.password}",
        readReplicaSupport = false)
@Configuration
public class ProductionConfig {
}
