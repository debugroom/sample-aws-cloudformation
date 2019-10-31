package org.debugroom.sample.cloudformation.backend.config;

import javax.sql.DataSource;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Profile("dev")
@Configuration
public class DevConfig {

    @Bean
    public DataSource dataSource(){
        return (new EmbeddedDatabaseBuilder())
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("classpath:ddl/schema_hsql.sql")
                .addScript("classpath:ddl/data.sql")
                .build();
    }

    @Bean
    public DynamoDBMapperConfig dynamoDBMapperConfig(){
        return DynamoDBMapperConfig.builder()
                .withTableNameOverride(
                        DynamoDBMapperConfig.TableNameOverride
                                .withTableNamePrefix("dev_"))
                .build();
    }

}
