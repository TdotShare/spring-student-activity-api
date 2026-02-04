package com.spring_student_activity_api.dto;

import com.spring_student_activity_api.model.Activity;

public interface EvaluationActivityDetailView {

    Integer getEvaId();
    String getEvaStudentCode();
    String getEvaGrade();


    InfoActivity getActivity();

    interface  InfoActivity {
        Integer getActivityId();
        String getActivityCode();
        String getActivityName();

        InfoCategory getCategory();

        interface  InfoCategory {
            Integer getCategoryId();
            String getCategoryNameTh();
        }
    }
}
