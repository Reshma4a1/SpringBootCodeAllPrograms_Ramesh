package com.rameshit.mvc.login;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("loginValidator")
public class LoginValidator implements Validator {

	public boolean supports(Class clazz) {
		return clazz.equals(LoginModel.class);
	}

	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "null", "UserName is required.");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "null", "Password is required.");
	}
}
