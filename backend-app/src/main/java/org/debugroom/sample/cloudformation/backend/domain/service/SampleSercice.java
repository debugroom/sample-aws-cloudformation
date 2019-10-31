package org.debugroom.sample.cloudformation.backend.domain.service;

import java.util.List;

import org.debugroom.sample.cloudformation.common.model.SampleResource;
import org.debugroom.sample.cloudformation.backend.domain.model.jpa.entity.User;

public interface SampleSercice {

    public List<User> getUsers();

    public List<SampleResource> getSamples();

    public SampleResource addSample();

}
