package com.spring_student_activity_api.service;

import com.spring_student_activity_api.dto.ActivityInfoPagination;
import com.spring_student_activity_api.dto.ActivityStudentParticipationView;
import com.spring_student_activity_api.model.Activity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ActivityService {

    Activity findById (Integer actId);
    Optional<ActivityStudentParticipationView> findProjectedActivityStudentParticipation(String actCode);
    Page<ActivityInfoPagination> getActivities(String keyword, int page);

}
