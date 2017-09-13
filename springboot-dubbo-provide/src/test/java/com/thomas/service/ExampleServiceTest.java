package com.thomas.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thomas.config.TestConfig;

import junit.framework.TestCase;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExampleServiceTest {
	
	@Autowired
	private ExampleService exampleService;
	
	@Test
	public void testHello() {
		
		String name = "name";
		String expect = "Hello,"+name;
		
		String returnString = exampleService.hello(name);
		TestCase.assertEquals(expect, returnString);
	}

}
