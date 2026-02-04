package com.spring_student_activity_api.controller;


import com.spring_student_activity_api.model.Activity;
import com.spring_student_activity_api.service.ActivityService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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


}
