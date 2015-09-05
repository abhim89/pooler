package com.asa.pooler.service;

import com.asa.pooler.dto.request.RegisterCustomerRequest;
import com.asa.pooler.dto.response.RegisterCustomerResponse;

public interface RegistrationService {

	RegisterCustomerResponse registerCustomer(
			RegisterCustomerRequest registerCustomerRequest);

}
