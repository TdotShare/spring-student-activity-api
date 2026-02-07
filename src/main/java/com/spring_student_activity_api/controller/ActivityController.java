package com.spring_student_activity_api.controller;

import com.spring_student_activity_api.dto.ActivityInfoPagination;
import com.spring_student_activity_api.dto.ActivityStudentParticipationView;
import com.spring_student_activity_api.model.Activity;
import com.spring_student_activity_api.service.ActivityService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.Optional;

@RestController
@RequestMapping("activity")
@Tag(name = "Activity Management", description = "ระบบจัดการกิจกรรมและการแบ่งรอบ")
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @Operation(summary = "ดึงข้อมูลกิจกรรม", description = "ดึงข้อมูลกิจกรรม (ById)")
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

    @GetMapping("getAllActivity")
    public Page<ActivityInfoPagination> getAllActivity(
            @RequestParam(name = "keyword", required = false) String keyword, // เพิ่มส่วนนี้
            @RequestParam(name = "page", defaultValue = "1") int page) {

        return this.activityService.getActivities(keyword, page);
    }
}
