package com.riwi.Simulacro_Spring_Boot_Drill.api.dto.request;

import com.riwi.Simulacro_Spring_Boot_Drill.utils.enums.RoleUser;

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
public class UserRequest {
    
    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "Email is required")
    private String email;

    private String fullName;

    @NotNull(message = "Role is requered")
    private RoleUser role;
}
