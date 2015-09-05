package com.asa.pooler.dto.response;

import com.asa.pooler.enums.ServerResponseType;

public class RegisterCustomerResponse extends ServerResponse{

	private static final long serialVersionUID = -6293287796340566096L;

	private String userId;

	public RegisterCustomerResponse(ServerResponseType responseType) {
		super(responseType);
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
