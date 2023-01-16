package com.recoveryplus.constant;

/**
 * All the exception message constant mapping should be added here.
 * @author Mindbowser
 *
 */
public class ExceptionMessage {
	private ExceptionMessage() {
		throw new IllegalStateException("Constant class.can't instatiate");
	}

	// Common
	public static final String INTERNAL_SERVER_ERROR = "internal.server.error";

	// User
	public static final String USER_NOT_FOUND = "user.not.found";

}
