package com.riwi.Simulacro_Spring_Boot_Drill.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CourseReponse {
    
    private Long id;
    private String name;
    private String description;
    private UserResponse instructorId;
}