package com.thomas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.thomas.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@Override
	public String hello(String name) {
		
		logger.info("--------------------"+name);
		
		return "Hello," + name;
	}

}
