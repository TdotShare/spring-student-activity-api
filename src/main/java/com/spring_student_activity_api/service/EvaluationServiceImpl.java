package com.spring_student_activity_api.service;

import com.spring_student_activity_api.dto.EvaluationActivityDetailView;
import com.spring_student_activity_api.model.Evaluation;
import com.spring_student_activity_api.repository.EvaluationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvaluationServiceImpl implements EvaluationService {

    private final EvaluationRepository evaluationRepository;

    public EvaluationServiceImpl(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    @Override
    public List<Evaluation> findAllByEvaStudentCode(String evaStudentCode) {

        List<Evaluation> data = this.evaluationRepository.findByEvaStudentCode(evaStudentCode, Evaluation.class);

        System.out.println("--- เริ่มการ Loop เพื่อเช็ค Lazy Loading ---");

        for (Evaluation item : data) {
            // ณ จุดนี้ ถ้าคุณยังไม่เรียก item.getActivity()
            // JPA จะยังไม่ยิง SQL ไปที่ตาราง act_activity

            if (item.getActivity() != null) {
                // เมื่อเรียก getActivity() และเข้าถึงข้อมูลข้างใน (เช่น getName)
                // Hibernate จะยิง SQL "SELECT ... FROM act_activity" ทันที (นี่คือ Lazy Loading)
                System.out.println("ID: " + item.getEvaId() + " -> Activity Name: " + item.getActivity().getActivityName());
            } else {
                System.out.println("ID: " + item.getEvaId() + " -> No Activity found");
            }
        }

        System.out.println("--- จบการ Loop ---");

        return this.evaluationRepository.findByEvaStudentCode(evaStudentCode, Evaluation.class);
    }

    public List<EvaluationActivityDetailView> findAllByEvaStudentCodeWithActivity(String evaStudentCode) {
        return this.evaluationRepository.findByEvaStudentCode(evaStudentCode, EvaluationActivityDetailView.class);
    }

}
