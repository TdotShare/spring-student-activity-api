package com.spring_student_activity_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_student_activity_api.dto.UserRoleView;
import com.spring_student_activity_api.model.User;

public interface UserRepository extends JpaRepository<User , Integer> {
    Optional<User> findByUserUsername(String username);
    Optional<UserRoleView> findProjectedByUserUsername(String name);
}
