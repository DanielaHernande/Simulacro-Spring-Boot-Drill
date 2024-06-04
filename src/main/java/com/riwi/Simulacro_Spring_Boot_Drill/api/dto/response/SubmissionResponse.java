package com.riwi.Simulacro_Spring_Boot_Drill.api.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionResponse {
    
    private Long id;
    private String content;
    private LocalDateTime date;
    private BigDecimal grade;
    private UserResponse userId;
    private AssignmentResponse assignmentId;
}