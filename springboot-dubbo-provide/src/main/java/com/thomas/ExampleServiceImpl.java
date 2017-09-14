package com.thomas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.thomas.service.ExampleService;

/**
 * @author thomas
 *
 */
@Service
public class ExampleServiceImpl implements ExampleService {

	/**
	 * 日志
	 */
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	/* (non-Javadoc)
	 * @see com.thomas.service.ExampleService#hello(java.lang.String)
	 */
	@Override
	public String hello(String name) {
		logger.info("方法调用，入参: %s", name);
		return "Hello," + name;
	}


}
