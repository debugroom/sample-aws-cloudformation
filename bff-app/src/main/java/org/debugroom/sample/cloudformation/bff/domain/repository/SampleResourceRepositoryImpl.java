package org.debugroom.sample.cloudformation.bff.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import java.util.Arrays;
import java.util.List;

import org.debugroom.sample.cloudformation.bff.domain.model.Sample;
import org.debugroom.sample.cloudformation.common.model.SampleResource;

@Component
public class SampleResourceRepositoryImpl implements SampleResourceRepository{

    private static final String SERVICE_NAME = "/backend";
    private static final String API_VERSION = "/api/v1";

    @Autowired
    RestOperations restOperations;

    @Override
    public List<SampleResource> findAll() {
        String endpoint = SERVICE_NAME + API_VERSION + "/samples";
        return Arrays.asList(restOperations.getForObject(
                endpoint, Sample[].class));
    }

}
