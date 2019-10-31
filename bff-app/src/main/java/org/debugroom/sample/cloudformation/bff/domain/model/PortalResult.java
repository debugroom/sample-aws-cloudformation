package org.debugroom.sample.cloudformation.bff.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.debugroom.sample.cloudformation.common.model.SampleResource;
import org.debugroom.sample.cloudformation.common.model.UserResource;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PortalResult {

    private List<SampleResource> sampleResourceList;
    private List<UserResource> userResourceList;

}
