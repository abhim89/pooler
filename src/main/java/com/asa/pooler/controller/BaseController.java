package com.asa.pooler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.asa.pooler.dto.request.RegisterCustomerRequest;
import com.asa.pooler.dto.response.LaunchResponse;
import com.asa.pooler.dto.response.RegisterCustomerResponse;
import com.asa.pooler.service.LaunchService;
import com.asa.pooler.service.RegistrationService;

@RestController
public class BaseController {

    @Autowired
    private LaunchService launchService;
    
    @Autowired
    private RegistrationService registrationService;
    
    @RequestMapping("/launchService/startSession")
    public LaunchResponse startSession(@RequestParam(value="userId") String userId) {
        return launchService.startSession(userId);
    }
    
    @RequestMapping("/registrationService/registerCustomer")
    public RegisterCustomerResponse registerCustomer(@RequestBody @Validated RegisterCustomerRequest registerCustomerRequest) {
        return registrationService.registerCustomer(registerCustomerRequest);
    }
}
