package com.asa.pooler;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Component
public class InitializerService {

	public InitializerService() {
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		localValidatorFactoryBean();
	}

	@Bean
	public javax.validation.Validator localValidatorFactoryBean() {
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		System.out.println("**********************************************");
		return new LocalValidatorFactoryBean();
	}

}
