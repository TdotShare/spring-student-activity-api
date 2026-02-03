package com.spring_student_activity_api.service;

import com.spring_student_activity_api.dto.EvaluationActivityDetailView;
import com.spring_student_activity_api.model.Evaluation;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EvaluationService {
    public  List<Evaluation> findAllByEvaStudentCode(String evaStudentCode);
    public  List<EvaluationActivityDetailView> findAllByEvaStudentCodeWithActivity(String evaStudentCode);
}
