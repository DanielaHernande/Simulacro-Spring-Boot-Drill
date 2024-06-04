package com.riwi.Simulacro_Spring_Boot_Drill.api.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentRequest {
    @NotNull(message = "User is required")
    private Long userId;

    @NotNull(message = "Course is required")
    private Long courseId;
}
