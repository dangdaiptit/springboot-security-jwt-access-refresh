package com.tutorial.apidemo.Springboot.tutorial.services;

import com.tutorial.apidemo.Springboot.tutorial.domain.Role;
import com.tutorial.apidemo.Springboot.tutorial.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User>getUsers();

}
