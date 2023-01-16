package com.recoveryplus.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.recoveryplus.constant.ExceptionMessage;
import com.recoveryplus.exception.CustomException;
import com.recoveryplus.user.entity.User;
import com.recoveryplus.user.repository.UserRepo;
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private Environment env;
	
	@Override
	public User saveUser(User user) {
		
		try {
			return userRepo.save(user);
		} catch (Exception e) {
			throw new CustomException(env.getProperty(ExceptionMessage.INTERNAL_SERVER_ERROR), e,
					HttpStatus.INTERNAL_SERVER_ERROR.value());
		}
	}

}
