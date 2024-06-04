package com.riwi.Simulacro_Spring_Boot_Drill.api.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentResponse {
    
    private Long id;
    private UserResponse userId;
    private CourseReponse courseId;
    private LocalDate date;
}
