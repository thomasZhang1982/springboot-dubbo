package com.thomas.config;



import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan(basePackages = { "com.thomas.**" })
@PropertySource("classpath:application.properties")
public class TestConfig implements EnvironmentAware{

	@SuppressWarnings("unused")
	private Environment environment;

	@Override
	public void setEnvironment(Environment environment) {
		this.environment=environment;
	}
	
	
}
