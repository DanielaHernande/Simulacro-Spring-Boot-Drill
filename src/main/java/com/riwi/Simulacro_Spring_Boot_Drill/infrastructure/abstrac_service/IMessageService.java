package com.riwi.Simulacro_Spring_Boot_Drill.infrastructure.abstrac_service;

import com.riwi.Simulacro_Spring_Boot_Drill.api.dto.request.MessageRequest;
import com.riwi.Simulacro_Spring_Boot_Drill.api.dto.response.MessageResponse;

public interface IMessageService extends ServiceBase<MessageRequest, MessageResponse, Long>{
    
}
