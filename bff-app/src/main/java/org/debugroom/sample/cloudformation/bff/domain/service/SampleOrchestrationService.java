package org.debugroom.sample.cloudformation.bff.domain.service;

import org.debugroom.sample.cloudformation.bff.domain.model.PortalResult;
import org.debugroom.sample.cloudformation.common.model.SampleResource;
import org.debugroom.sample.cloudformation.common.model.UserResource;

import java.util.List;

public interface SampleOrchestrationService {

    public List<SampleResource> getSamples();

    public List<UserResource> getUsers();

    public PortalResult getPortalResult();

}
