package com.gradex_cloud.gradex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {

	@RequestMapping(value="/helloWorld",method=RequestMethod.GET)
	public String helloWorld(String name) {
		return "Hello, "+name +"  This,is your world !";
	}
}
