package com.spring_student_activity_api.service;


import com.spring_student_activity_api.dto.ActivityInfoPagination;
import com.spring_student_activity_api.dto.ActivityStudentParticipationView;
import com.spring_student_activity_api.exception.ResourceNotFoundException;
import com.spring_student_activity_api.model.Activity;
import com.spring_student_activity_api.repository.ActivityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class ActivityServiceImpl implements   ActivityService {

    private ActivityRepository activityRepository;

    public ActivityServiceImpl(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public Activity findById(Integer actId) {
        return activityRepository.findById(actId)
                .orElseThrow(() -> new ResourceNotFoundException("ไม่พบข้อมูล ID : " + actId));
    }

    @Override
    public Optional<ActivityStudentParticipationView> findProjectedActivityStudentParticipation(String actCode) {
        // ดึงจาก Repo ถ้าไม่เจอพ่น 404 ทันที ไม่ต้องครอบ Optional ซ้ำ
        return Optional.of(activityRepository.findProjectedActivityStudentParticipation(actCode)
                .orElseThrow(() -> new ResourceNotFoundException("ไม่พบข้อมูล Code : " + actCode)));
    }

    @Override
    public Page<ActivityInfoPagination> getActivities(String keyword, int page) {
        Sort sort = Sort.by("activityId").descending();
        Pageable pageable = PageRequest.of(page, 10, sort);

        // ส่ง keyword ไปที่ Repo (ถ้า keyword เป็น "" หรือ null ตัว Query ที่เราแก้จะดึงทั้งหมดให้เอง)
        return activityRepository.findAllActivities(keyword, pageable);
    }
}
