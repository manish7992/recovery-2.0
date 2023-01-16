package com.recoveryplus.constant;

/**
 * URL endpoint should be added here.
 * @author Mindbowser
 *
 */
public class UrlMapping {
	private UrlMapping() {
		throw new IllegalStateException("Constant class.can't instatiate");
	}
	public static final String BASE_URL = "/api/v1/";
	//Health Check
	public static final String HEALTH_CHECK = "healthCheck";

	// User Controller
	public static final String USER_BASE_URL = BASE_URL+"users";
	
	public static final String USER_REGISTER = "/register";
	public static final String LOGIN = "/login";
	public static final String FOREGT_PASSWORD = "/forget-password";
	public static final String RESET_PASSWORD = "/reset-password";
	public static final String USER_DETAILS = "/{userId}";
	
}
