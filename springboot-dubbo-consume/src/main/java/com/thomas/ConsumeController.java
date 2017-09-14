package com.thomas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thomas.service.ExampleService;

/**
 * @author thomas
 *
 */
@RestController
public class ConsumeController {

	/**
	 * 示例服务
	 */
	@Autowired
	private ExampleService exempleServiceForConsume;
	
	
    /**
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    public String index(@RequestParam(defaultValue="default") String name) {
    	return exempleServiceForConsume.hello(name);
    }
	
}
