package com.recoveryplus.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recoveryplus.user.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
