package com.gradex_cloud.gradex.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-provider")
public interface HelloConsumer {
	 /**
     * 远程调用helloWorld的接口
     * @param name
     * @return
     */
    @RequestMapping(value="/helloWorld" , method= RequestMethod.GET)
    public String helloWorld(@RequestParam("name") String name) ;
}
