package com.recoveryplus.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recoveryplus.constant.ResponseMessage;
import com.recoveryplus.constant.SwaggerConstant;
import com.recoveryplus.constant.UrlMapping;
import com.recoveryplus.dto.RegisterDto;
import com.recoveryplus.user.model.UserModel;
import com.recoveryplus.user.service.UserService;
import com.recoveryplus.util.ResponseMaker;
import com.recoveryplus.web.model.SuccessResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(UrlMapping.USER_BASE_URL)
public class UserController {

	@Autowired
	private ResponseMaker responseMaker;

	@Autowired
	private Environment env;

	@Autowired
	private UserService userService;

	@PostMapping(UrlMapping.USER_REGISTER)
	@Operation(summary = "registering user ", description = "registering user into recovery plus", tags = {
			SwaggerConstant.USER })
	@ApiResponses(value = { @ApiResponse(responseCode = SwaggerConstant.OK, description = SwaggerConstant.SUCCESS),
			@ApiResponse(responseCode = SwaggerConstant.BAD_REQUEST, description = SwaggerConstant.INVALID_BODY, content = @Content) })
	public ResponseEntity<SuccessResponse<UserModel>> registerUser(@RequestBody RegisterDto registerDto) {

		UserModel userModel = userService.registerUser(registerDto);

		return responseMaker.successResponse(env.getProperty(ResponseMessage.SUCCESS), userModel);
	}

}
