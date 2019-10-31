package org.debugroom.sample.cloudformation.bff.domain.model;

import org.debugroom.sample.cloudformation.common.model.SampleResource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Sample implements SampleResource {

    private String samplePartitionKey;
    private String sampleSortKey;
    private String sampleText;

}
