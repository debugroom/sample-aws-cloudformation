package org.debugroom.sample.cloudformation.common.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserResource implements Serializable {

    private String userId;
    private String firstName;
    private String familyName;
    private String loginId;
    private boolean isLogin;


}
