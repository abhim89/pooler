package com.asa.pooler.dto.response;

import java.io.Serializable;

import com.asa.pooler.enums.ServerResponseType;

public class ServerResponse implements Serializable{

	private static final long serialVersionUID = -8636444816527862953L;

	private ServerResponseType responseType;
	
	private String failureReason;

	public ServerResponse(ServerResponseType responseType) {
		this.responseType = responseType;
	}
	
	public ServerResponseType getResponseType() {
		return responseType;
	}
	
	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}
	
}
