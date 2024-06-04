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
public class AssignmentResponse {
    
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private LessonResponse lessonId;
}