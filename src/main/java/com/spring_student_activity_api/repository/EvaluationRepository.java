package com.spring_student_activity_api.repository;

import com.spring_student_activity_api.dto.EvaluationActivityDetailView;
import com.spring_student_activity_api.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvaluationRepository extends JpaRepository<Evaluation , Integer> {
    <T> List<T> findByEvaStudentCode(String evaStudentCode, Class<T> type);
}
