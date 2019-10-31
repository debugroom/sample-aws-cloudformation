package org.debugroom.sample.cloudformation.bff.domain.repository;

import org.debugroom.sample.cloudformation.common.model.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

import java.util.Arrays;
import java.util.List;

@Component
public class UserResourceRepositoryImpl implements UserResourceRepository{

    private static final String SERVICE_NAME = "/backend";
    private static final String API_VERSION = "/api/v1";

    @Autowired
    RestOperations restOperations;

    @Override
    public List<UserResource> findAll() {
        String endpoint = SERVICE_NAME + API_VERSION + "/users";
        return Arrays.asList(restOperations.getForObject(
                endpoint, UserResource[].class));
    }

}
