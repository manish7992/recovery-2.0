package com.recoveryplus.user.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recoveryplus.dto.RegisterDto;
import com.recoveryplus.user.dao.UserDao;
import com.recoveryplus.user.entity.User;
import com.recoveryplus.user.model.UserModel;
import com.recoveryplus.util.Mapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private Mapper mapper;
//	
//	@Autowired
//	private BCryptPasswordEncoder encoder;

	/**
	 * Add User
	 * 
	 * @author rohit.kumar@mindbowser.com
	 * @param registerDto
	 * @return {@link UserModel}
	 */
	@Override
	public UserModel registerUser(@Valid RegisterDto registerDto) {
		User user = mapper.convert(registerDto, User.class);
		// user.setPassword(encoder.encode(userDto.getPassword()));
		userDao.saveUser(user);
		return mapper.convert(userDao.saveUser(user), UserModel.class);

	}

}
