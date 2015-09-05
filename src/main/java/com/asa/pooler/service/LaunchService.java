package com.asa.pooler.service;

import com.asa.pooler.dto.response.LaunchResponse;

public interface LaunchService {

	LaunchResponse startSession(String userId);
    
}
