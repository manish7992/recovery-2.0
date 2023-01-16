package com.recoveryplus.web.validation;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;


public class NameNumberValidator implements ConstraintValidator<ValidNameNumber, String> {

	private String regex = "^[a-zA-Z0-9 ]+$";

	@Override
	public boolean isValid(String name, ConstraintValidatorContext context) {
		if (StringUtils.isEmpty(name))
			return true;

		Pattern pat = Pattern.compile(regex);
		return pat.matcher(name).matches();
	}

}
