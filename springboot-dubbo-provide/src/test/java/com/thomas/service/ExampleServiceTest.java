package com.thomas.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.thomas.config.TestConfig;

import junit.framework.TestCase;


/**
 * @author thomas
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { TestConfig.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleServiceTest {
	
	/**
	 * 示例服务测试注入
	 */
	@Autowired
	private ExampleService exampleService;
	
	/**
	 * 示例服务方法测试
	 */
	@Test
	public void testHello() {
		
		String name = "name";
		String expect = "Hello,"+name;
		
		String returnString = exampleService.hello(name);
		TestCase.assertEquals(expect, returnString);
	}

}
