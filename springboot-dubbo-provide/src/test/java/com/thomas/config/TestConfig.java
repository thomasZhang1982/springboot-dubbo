package com.thomas.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * @author thomas
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.thomas.**" })
@PropertySource("classpath:application.properties")
public class TestConfig{
	
	
}
