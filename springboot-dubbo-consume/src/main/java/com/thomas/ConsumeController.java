package com.thomas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thomas.service.ExampleService;

@RestController
public class ConsumeController {

	@Autowired
	private ExampleService exempleServiceForConsume;
	
	
    @RequestMapping("/hello")
    public String index(@RequestParam(defaultValue="default") String name) {
    	return exempleServiceForConsume.hello(name);
    }
	
}
