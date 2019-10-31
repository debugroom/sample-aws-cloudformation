package org.debugroom.sample.cloudformation.bff.app.web;

import lombok.extern.slf4j.Slf4j;
import org.debugroom.sample.cloudformation.bff.app.web.model.SampleSession;
import org.debugroom.sample.cloudformation.bff.domain.model.PortalResult;
import org.debugroom.sample.cloudformation.bff.domain.service.SampleOrchestrationService;
import org.debugroom.sample.cloudformation.common.model.SampleResource;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SampleController {

    private static final String HEADER_HOST_NAME_KEY_NAME = "X-HostName";

    @Value("${app.host}")
    private String host;

    @Autowired
    SampleSession sampleSession;

    @Autowired
    SampleOrchestrationService sampleOrchestrationService;

    @GetMapping("/portal")
    public String portal(Model model){
        PortalResult portalResult = sampleOrchestrationService.getPortalResult();
        sampleSession.setBffHost(host);
        sampleSession.setBackendHost(MDC.get(HEADER_HOST_NAME_KEY_NAME));
        model.addAttribute("sampleResources",
                portalResult.getSampleResourceList());
        model.addAttribute("userResources",
                portalResult.getUserResourceList());
        model.addAttribute("sampleSession", sampleSession);
        return "portal";
    }

}
