package com.asa.pooler.service;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asa.pooler.dto.request.RegisterCustomerRequest;
import com.asa.pooler.dto.response.RegisterCustomerResponse;
import com.asa.pooler.enums.ServerResponseType;
import com.asa.pooler.persistence.dao.CustomerDao;
import com.asa.pooler.persistence.entity.Customer;

@Component
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private CustomerDao customerDao;
	
	public RegisterCustomerResponse registerCustomer(
			RegisterCustomerRequest registerCustomerRequest) {
		Customer customer = new Customer();
		validateUserId(registerCustomerRequest);
		
		customer.setUserId(registerCustomerRequest.getUserId());
		customer.setName(registerCustomerRequest.getName());
		customer.setEmail(registerCustomerRequest.getEmail());
		customer.setMobile(registerCustomerRequest.getMobileNumber());
		customerDao.save(customer);
		
		RegisterCustomerResponse response = new RegisterCustomerResponse(
				ServerResponseType.SUCCESS);
		response.setUserId(customer.getUserId());
		return response;
	}

	private void validateUserId(RegisterCustomerRequest registerCustomerRequest) {
		Customer existingCustomer = customerDao.findByUserId(registerCustomerRequest.getUserId());
		if(existingCustomer != null) {
			throw new ValidationException("Invalid User Id: User Id is already registered");
		}
	}

}
