package com.gradex_cloud.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("authorizationRequest")
public class ErrorController {

	@RequestMapping("/oauth/error")
    public String error(@RequestParam Map<String, String> parameters){
        String url = parameters.get("redirect_uri");
         System.out.println("重定向: {}"+ url);
        return "redirect:" + url + "?error=1";
    }

}
