package com.recoveryplus.constant;

public class ResponseMessage {
	private ResponseMessage() {
		throw new IllegalStateException("Constant class.can't instatiate");
	}

	public static final String SUCCESS = "status.success";
	public static final String API_WORKING = "api.working";

}