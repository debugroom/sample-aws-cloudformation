package org.debugroom.sample.cloudformation.bff.domain.repository;

import org.debugroom.sample.cloudformation.common.model.SampleResource;

import java.util.List;

public interface SampleResourceRepository {

    public List<SampleResource> findAll();

}
