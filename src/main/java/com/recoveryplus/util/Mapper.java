package com.recoveryplus.util;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.recoveryplus.exception.CustomException;

@Component
public class Mapper {

	/**
	 * Map source object to target class
	 * 
	 * @author Mindbowser | rohit.kumar@mindbowser.com
	 * @Created Date: Dec 29, 2022 02:21:34 AM
	 * @param <T>
	 * @param srcObj
	 * @param targetClass
	 * @return
	 */
	public <T> T convert(Object srcObj, Class<T> targetClass) {
		T response = null;

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setAmbiguityIgnored(true);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		try {
			response = modelMapper.map(srcObj, targetClass);
		} catch (Exception e) {
			throw new CustomException(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return response;
	}

}
