package com.recoveryplus.constant;

/**
 * All the static keys declaration should be added here.
 * @author Mindbowser
 *
 */
public class StaticKeys {
	private StaticKeys() {
		throw new IllegalStateException("Constant class.can't instatiate");
	}

	public static final String ROLE_PREFIX = "ROLE_";
	public static final String MSG_VARIABLE = "{#var#}";

	// Sorting Fields
	public static final String FULL_NAME = "fullName";
	public static final String CREATED_DATE = "createdAt";
	public static final String ASC = "ASC";
	public static final String DESC = "DESC";
	public static final String DATE = "DATE";
	public static final String NAME = "NAME";
	public static final String START_DATE = "startDate";
	public static final String DEFAULT_PAGE = "1";
	
	//page size should be coming from properties file
	public static final String PAGE_SIZE = "page.size";

	public static final String FALSE = "false";
	public static final String TRUE = "true";
	
	//user 
	public static final String USER_DETAILS = "userDetails";
	
	//Exceptions
	public static final String ERROR = "error";
}
