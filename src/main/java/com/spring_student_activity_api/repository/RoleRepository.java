package com.spring_student_activity_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_student_activity_api.model.Role;

public interface RoleRepository extends JpaRepository<Role , Integer> {

    
}
