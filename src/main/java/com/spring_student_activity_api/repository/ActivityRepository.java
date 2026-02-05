package com.spring_student_activity_api.repository;

import com.spring_student_activity_api.dto.ActivityInfoPagination;
import com.spring_student_activity_api.dto.ActivityStudentParticipationView;
import com.spring_student_activity_api.model.Activity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ActivityRepository extends JpaRepository<Activity , Integer> {

    @Query(value = "SELECT a.activityId, a.activityCode, COUNT(e.evaActivityId) as studentCount " +
            "FROM act_activity a " +
            "LEFT JOIN act_evaluation e ON e.evaActivityId = a.activityId " +
            "WHERE a.activityCode = :actCode " +
            "GROUP BY a.activityId, a.activityCode", nativeQuery = true)
    Optional<ActivityStudentParticipationView> findProjectedActivityStudentParticipation(@Param("actCode") String actCode);

    @Query("SELECT a FROM Activity a WHERE (:name IS NULL OR a.activityName LIKE %:name%)")
    Page<ActivityInfoPagination> findAllActivities(@Param("name") String activityName, Pageable pageable);
}
