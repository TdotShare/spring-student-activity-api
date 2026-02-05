package com.spring_student_activity_api.controller;


import com.spring_student_activity_api.dto.ActivityInfoPagination;
import com.spring_student_activity_api.model.Activity;
import com.spring_student_activity_api.service.ActivityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ActivityController.class)
public class ActivityControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ActivityService activityService;

    private Activity mockActivity;


    @BeforeEach
    void setup(){
        mockActivity = new Activity();
        mockActivity.setActivityId(1);
        mockActivity.setActivityName("ทดสอบระบบ");
    }

    @Test
    void testFindById_Success() throws Exception {
        // Arrange: เมื่อเรียก getDirectiveDocAll ให้คืนค่า List ของ DTO
        when(activityService.findById(1)).thenReturn(mockActivity);

        // Act & Assert
        mockMvc.perform(get("/activity/findById/1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.activityId").value(1));
    }

    @Test
    void testFindById_NotFound() throws Exception {
        // Arrange: เมื่อเรียก getDirectiveDocAll ให้คืนค่า List ของ DTO
        when(activityService.findById(99)).thenReturn(null);

        // Act & Assert
        mockMvc.perform(get("/activity/findById/99")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }

    @Test
    void testPaginationActivities_Success() throws Exception {
        // 1. Arrange
        ActivityInfoPagination mockActivityDto = mock(ActivityInfoPagination.class);
        when(mockActivityDto.getActivityId()).thenReturn(1);
        when(mockActivityDto.getActivityName()).thenReturn("Test Activity");

        List<ActivityInfoPagination> list = List.of(mockActivityDto);
        Page<ActivityInfoPagination> pageResponse = new PageImpl<>(list);

        // แก้ไขตรงนี้: ใช้ any() เพื่อลดความเข้มงวดในการจับคู่พารามิเตอร์
        when(activityService.getActivities(any(), anyInt())).thenReturn(pageResponse);

        // 2. Act & Assert
        mockMvc.perform(get("/activity/getAllActivity").param("page", "1").param("keyword", ""))
                .andDo(print()) // จะพ่นค่าที่ Response ออกมาที่ Console
                .andExpect(status().isOk());
    }
}
