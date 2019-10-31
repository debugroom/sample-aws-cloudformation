package org.debugroom.sample.cloudformation.backend.app.model;

import org.debugroom.sample.cloudformation.backend.domain.model.jpa.entity.User;
import org.debugroom.sample.cloudformation.common.model.UserResource;

import java.util.List;
import java.util.stream.Collectors;

public interface UserResourceMapper {

    public static UserResource map(User user){
        return UserResource.builder()
                .userId(Long.toString(user.getUserId()))
                .firstName(user.getFirstName())
                .familyName(user.getFamilyName())
                .isLogin(user.getIsLogin())
                .build();
    }

    public static List<UserResource> map(List<User> users){
        return users.stream().map(UserResourceMapper::map)
                .collect(Collectors.toList());
    }

}
