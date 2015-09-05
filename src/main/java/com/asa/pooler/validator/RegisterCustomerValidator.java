package com.asa.pooler.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.asa.pooler.dto.request.RegisterCustomerRequest;

public class RegisterCustomerValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return RegisterCustomerRequest.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("Validators running");
	}

}
