package com.spring_student_activity_api.service;


import com.spring_student_activity_api.dto.ActivityStudentParticipationView;
import com.spring_student_activity_api.exception.ResourceNotFoundException;
import com.spring_student_activity_api.model.Activity;
import com.spring_student_activity_api.repository.ActivityRepository;
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
        return Optional.of(
                activityRepository.findProjectedActivityStudentParticipation(actCode).orElseThrow(
                        () -> new ResourceNotFoundException("ไม่พบข้อมูล Code : " + actCode)
                )
        );
    }
}
