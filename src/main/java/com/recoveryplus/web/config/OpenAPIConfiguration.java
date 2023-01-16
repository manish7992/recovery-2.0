package com.recoveryplus.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.recoveryplus.constant.SwaggerConstant;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfiguration {

	@Bean
	public OpenAPI openApi() {

		return new OpenAPI().info(new Info().title(SwaggerConstant.TITLE).description(SwaggerConstant.DESC)
				.version(SwaggerConstant.VERSION_1));
	}

}
