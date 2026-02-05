package com.spring_student_activity_api.dto;

public interface ActivityInfoPagination {

    Integer getActivityId();
    String getActivityName();
    String getActivityCode();

    InfoCategory getCategory();

    interface  InfoCategory {
        Integer getCategoryId();
        String getCategoryNameTh();
    }
}
