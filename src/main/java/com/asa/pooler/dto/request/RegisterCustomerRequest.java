package com.asa.pooler.dto.request;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class RegisterCustomerRequest {

	@NotBlank
	@Length(max=20)
	private String userId;
	
	@NotBlank
	@Length(max=100)
	private String name;
	
	@NotBlank
	@Length(min=6, max=20)
	private String password;
	
	@NotBlank
	@Length(max=20)
	private String mobileNumber;
	
	@Email
	@Length(max=50)
	private String email;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
