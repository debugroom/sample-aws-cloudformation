package org.debugroom.sample.cloudformation.backend.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories(
        basePackages = "org.debugroom.sample.cloudformation.backend.domain.repository.dynamodb")
public class DymamoDBConfig {

    @Value("${amazon.dynamodb.region}")
    private String region;
    @Value("${amazon.dynamodb.endpoint}")
    private String endpoint;

    @Bean
    public AmazonDynamoDB amazonDynamoDB(){
        return AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
                new AwsClientBuilder.EndpointConfiguration(endpoint, region)).build();
    }

}
