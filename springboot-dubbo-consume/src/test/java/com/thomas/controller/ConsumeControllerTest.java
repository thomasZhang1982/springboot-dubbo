package com.thomas.controller;



import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.thomas.ConsumeController;
import com.thomas.config.TestConfig;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfig.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@EnableWebMvc
public class ConsumeControllerTest {
	
	private MockMvc mvc;
	
	@Autowired
	private ConsumeController consumeController;
	
	
	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(consumeController).build();
	}
	
	
	@Test
	public void testHello() throws Exception {
		String name = "name";
		
		RequestBuilder request = get("/hello")
				.param("name", name);
		
		String responseString = mvc.perform(request).andExpect(status().isOk())
				.andReturn().getResponse().getContentAsString();
		
		String expect = "Hello,"+name;
		TestCase.assertEquals(expect, responseString);
		
	}

}
