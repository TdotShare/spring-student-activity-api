package com.spring_student_activity_api.controller;

import com.spring_student_activity_api.dto.ActivityStudentParticipationView;
import com.spring_student_activity_api.model.Activity;
import com.spring_student_activity_api.service.ActivityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("activity")
public class ActivityController {

    private ActivityService activityService;


    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping("findById/{actId}")
    public Activity findById(@PathVariable(name = "actId" , required = true) Integer actId)
    {
        return this.activityService.findById(actId);
    }

    @GetMapping("findProjectedActivityStudentParticipation/{actCode}")
    public Optional<ActivityStudentParticipationView> findProjectedActivityStudentParticipation(@PathVariable(name = "actCode" , required = true) String actCode)
    {
        return this.activityService.findProjectedActivityStudentParticipation(actCode);
    }
}
