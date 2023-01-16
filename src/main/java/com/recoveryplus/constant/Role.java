package com.recoveryplus.constant;

/**
 * If the project is role based the should add roles here at common place.
 * 
 * @author Mindbowser
 *
 */
public class Role {
	private Role() {
		throw new IllegalStateException("Constant class.can't instatiate");
	}

	public static final String ADMIN = "hasRole('ADMIN')";

	public static final String ALL = "hasAnyRole('ADMIN','USER')";
}
