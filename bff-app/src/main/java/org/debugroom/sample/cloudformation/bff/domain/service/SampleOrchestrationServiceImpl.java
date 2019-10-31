package org.debugroom.sample.cloudformation.bff.domain.service;

import java.util.List;

import org.debugroom.sample.cloudformation.bff.domain.model.PortalResult;
import org.debugroom.sample.cloudformation.bff.domain.repository.UserResourceRepository;
import org.debugroom.sample.cloudformation.common.model.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.debugroom.sample.cloudformation.bff.domain.repository.SampleResourceRepository;
import org.debugroom.sample.cloudformation.common.model.SampleResource;

@Service
public class SampleOrchestrationServiceImpl
        implements SampleOrchestrationService{

    @Autowired
    SampleResourceRepository sampleResourceRepository;

    @Autowired
    UserResourceRepository userResourceRepository;

    @Override
    public List<SampleResource> getSamples(){
        return sampleResourceRepository.findAll();
    }

    @Override
    public List<UserResource> getUsers() {
        return userResourceRepository.findAll();
    }

    @Override
    public PortalResult getPortalResult() {
        return PortalResult.builder()
                .userResourceList(getUsers())
                .sampleResourceList(getSamples())
                .build();
    }

}
