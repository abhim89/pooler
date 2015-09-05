package com.asa.pooler.service;

import java.rmi.server.UID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asa.pooler.dto.response.LaunchResponse;
import com.asa.pooler.enums.ServerResponseType;
import com.asa.pooler.persistence.dao.CustomerDao;
import com.asa.pooler.persistence.entity.Customer;

@Component
public class LaunchServiceImpl implements LaunchService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public LaunchResponse startSession(String userId) {
		Customer customer = customerDao.findByUserId(userId);
		LaunchResponse response = null;
		if(customer == null) {
			response = new LaunchResponse(
					ServerResponseType.FAILURE, userId);
			response.setFailureReason("Invalid User Id: No Customer with this User id is Registered");
		} else {
			response = new LaunchResponse(
					ServerResponseType.SUCCESS, customer.getUserId());
			String sessionToken = (new UID()).toString();
			response.setSessionToken(sessionToken);
		}
		return response;
	}

}
