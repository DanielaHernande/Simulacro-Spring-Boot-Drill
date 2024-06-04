package com.riwi.Simulacro_Spring_Boot_Drill.api.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    private Long id;
    private UserResponse senderId;
    private UserResponse receiverId;
    private CourseReponse courseId;
    private String content;
    private LocalDateTime date;
}