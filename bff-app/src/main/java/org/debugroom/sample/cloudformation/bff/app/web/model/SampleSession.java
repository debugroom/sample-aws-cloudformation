package org.debugroom.sample.cloudformation.bff.app.web.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@SessionScope
@Component
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SampleSession implements Serializable {

    private String backendHost;
    private String bffHost;
    private Date lastUpdatedAt;

}
