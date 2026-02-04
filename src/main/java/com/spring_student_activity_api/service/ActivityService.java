package com.spring_student_activity_api.service;

import com.spring_student_activity_api.dto.ActivityStudentParticipationView;
import com.spring_student_activity_api.model.Activity;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ActivityService {
    Activity findById (Integer actId);
    Optional<ActivityStudentParticipationView> findProjectedActivityStudentParticipation(@Param("actCode") String actCode);
}
