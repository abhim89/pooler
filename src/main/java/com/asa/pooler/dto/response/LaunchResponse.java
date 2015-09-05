package com.asa.pooler.dto.response;

import com.asa.pooler.enums.ServerResponseType;

public class LaunchResponse extends ServerResponse {

	private static final long serialVersionUID = 3516291224105249905L;
	private String userId;
    private String sessionToken;

    public LaunchResponse(ServerResponseType responseType, String userId) {
    	super(responseType);
    	this.userId = userId;
    }

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	public String getUserId() {
		return userId;
	}
    
}
