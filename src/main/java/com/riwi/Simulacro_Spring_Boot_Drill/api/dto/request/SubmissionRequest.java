package com.riwi.Simulacro_Spring_Boot_Drill.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionRequest {
    
    @NotBlank(message = "Content is required")
    private String content;

    @NotNull(message = "User is required")
    private Long userId;

    @NotNull(message = "Assignment is required")
    private Long assignmentId;
}
