package com.recoveryplus.user.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor

public class UserModel {

	private Long id;

	private String firstName;

	private String lastName;

	private String email;

}
