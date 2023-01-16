package com.recoveryplus.user.service;

import javax.validation.Valid;

import com.recoveryplus.dto.RegisterDto;
import com.recoveryplus.user.model.UserModel;

public interface UserService {

	/**
	 * Add User
	 * @author rohit.kumar@mindbowser.com
	 * @param userDto
	 * @return {@link UserModel}
	 */
	UserModel registerUser(@Valid RegisterDto registerDto);

	

}
