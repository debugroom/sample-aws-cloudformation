package org.debugroom.sample.cloudformation.backend.app.web;

import org.debugroom.sample.cloudformation.backend.app.model.UserResourceMapper;
import org.debugroom.sample.cloudformation.common.model.SampleResource;
import org.debugroom.sample.cloudformation.backend.domain.service.SampleSercice;
import org.debugroom.sample.cloudformation.common.model.UserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class BackendController {

    private static final String HEADER_ID_KEY_NAME = "X-HostName";

    @Value("${app.host}")
    private String host;

    @ModelAttribute
    public void setResponseHeader(HttpServletResponse response){
        response.setHeader(HEADER_ID_KEY_NAME, host);
    }

    @Autowired
    SampleSercice sampleSercice;

    @GetMapping("/users")
    public List<UserResource> getUsers(){
        return UserResourceMapper.map(sampleSercice.getUsers());
    }

    @GetMapping("/samples")
    public List<SampleResource> getSamples(){
        return sampleSercice.getSamples();
    }

    @PostMapping("/samples/new")
    public SampleResource addSample(){
        return sampleSercice.addSample();
    }

}
