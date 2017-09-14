package com.thomas.config;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;

import com.thomas.MainConfig;


@ContextConfiguration(classes = { TestConfig.class })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseTest {
    @Test
    public void test(){
    	String[] args = {};
    	MainConfig.main(args);
    }

}