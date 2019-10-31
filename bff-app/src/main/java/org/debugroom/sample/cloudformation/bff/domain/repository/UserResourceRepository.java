package org.debugroom.sample.cloudformation.bff.domain.repository;

import org.debugroom.sample.cloudformation.common.model.UserResource;

import java.util.List;

public interface UserResourceRepository {

    public List<UserResource> findAll();

}
