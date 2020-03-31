package com.gradex_cloud.gradex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gradex_cloud.gradex.service.HelloConsumer;

@RestController
public class HelloConsumerController {
	
	 	@Autowired
	    private HelloConsumer myFristConsumer ;
	    /**
	     * 我的第一个微服务调用程序
	     * @param name
	     * @return
	     */
	    @RequestMapping(value="/consumerHelloWorld" , method= RequestMethod.GET)
	    public String helloWorld(String name) {
	        return myFristConsumer.helloWorld(name) ;
	    }
}
