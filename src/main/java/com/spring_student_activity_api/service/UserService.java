package com.spring_student_activity_api.service;

import java.util.Optional;

import com.spring_student_activity_api.dto.UserRoleView;
import com.spring_student_activity_api.model.User;

public interface UserService {
    public Optional<User> findByUserUsername(String username);
    public Optional<UserRoleView> findProjectedByUserUsername(String username);
}
