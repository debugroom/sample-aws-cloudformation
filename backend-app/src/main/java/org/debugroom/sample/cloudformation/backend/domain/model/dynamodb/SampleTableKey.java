package org.debugroom.sample.cloudformation.backend.domain.model.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SampleTableKey implements Serializable {

    @DynamoDBHashKey
    private String samplePartitionKey;
    @DynamoDBRangeKey
    private String sampleSortKey;

}
