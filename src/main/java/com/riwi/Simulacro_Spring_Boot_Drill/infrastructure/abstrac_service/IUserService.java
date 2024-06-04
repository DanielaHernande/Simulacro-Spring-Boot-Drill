package com.riwi.Simulacro_Spring_Boot_Drill.infrastructure.abstrac_service;

import com.riwi.Simulacro_Spring_Boot_Drill.api.dto.request.UserRequest;
import com.riwi.Simulacro_Spring_Boot_Drill.api.dto.response.UserResponse;

public interface IUserService extends ServiceBase<UserRequest, UserResponse, Long> {

    
}
