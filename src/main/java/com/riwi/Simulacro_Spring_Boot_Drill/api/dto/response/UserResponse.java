package com.riwi.Simulacro_Spring_Boot_Drill.api.dto.response;

import com.riwi.Simulacro_Spring_Boot_Drill.utils.enums.RoleUser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    
    private Long id;
    private String fullName;
    private RoleUser role;
    private String email;
}
