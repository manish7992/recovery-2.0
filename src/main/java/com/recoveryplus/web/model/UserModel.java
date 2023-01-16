package com.recoveryplus.web.model;

import com.recoveryplus.enums.EntityStatus;
import com.recoveryplus.enums.UserType;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class UserModel {

	private Integer id;

	private String firstName;

	private String lastName;

	private String profileImg;

	private String email;

	private String phone;

	private UserType userType;

	private EntityStatus userStatus;
}
