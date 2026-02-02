package com.spring_student_activity_api.dto;

public interface UserRoleView {
    Integer getUserId();
    String getUserUsername();

    InfoRole getRole();

    interface InfoRole {
        Integer getRoleId();
        String getRoleCode();
        String getRoleNameTH();
        String getRoleNameEN();
    }

}
