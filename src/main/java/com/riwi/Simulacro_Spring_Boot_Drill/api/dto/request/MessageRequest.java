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
public class MessageRequest {
    @NotNull(message = "User Sender is required")
    private Long senderId;

    private Long receiverId;
    private Long courseId;

    @NotBlank(message = "Content is required")
    private String content;
}
