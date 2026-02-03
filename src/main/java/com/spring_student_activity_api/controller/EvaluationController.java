package com.spring_student_activity_api.controller;

import com.spring_student_activity_api.dto.EvaluationActivityDetailView;
import com.spring_student_activity_api.model.Evaluation;
import com.spring_student_activity_api.service.EvaluationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("evaluation")
public class EvaluationController {

    private final EvaluationService evaluationService;

    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @GetMapping("findAllByEvaStudentCode/{studentCode}")
    public List<Evaluation> findAllByEvaStudentCode(@PathVariable String studentCode){
        return this.evaluationService.findAllByEvaStudentCode(studentCode);
    }

    @GetMapping("findAllByEvaStudentCodeWithActivity/{studentCode}")
    public List<EvaluationActivityDetailView> findAllByEvaStudentCodeWithActivity(@PathVariable String studentCode){
        return this.evaluationService.findAllByEvaStudentCodeWithActivity(studentCode);
    }
}
