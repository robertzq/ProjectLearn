package com.gradex_cloud.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gradex_cloud.security.CustomUserDetailVo;



@RestController
public class AuthController {

	@Autowired
	DefaultTokenServices defaultTokenServices;
	//获取当前“Token”用户信息
    @RequestMapping("/auth/user/getPrinciple")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oAuth2Authentication, Principal principal,
                             Authentication authentication){

        System.out.println(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
        System.out.println(oAuth2Authentication.toString());
        System.out.println("principal.toString() "+principal.toString());
        System.out.println("principal.getName() "+principal.getName());
        
        System.out.println("authentication: "+authentication.getAuthorities().toString());
        System.out.println("principal.getResources()");
        CustomUserDetailVo map = (CustomUserDetailVo)oAuth2Authentication.getUserAuthentication().getPrincipal();
        System.out.println(map.getResources());
        return oAuth2Authentication;

    }
	
	@RequestMapping(value="/auth/user/e",produces = "application/json")
	public Map<String, Object> user() {
		Map<String, Object> userInfo = new HashMap<String,Object>();
        userInfo.put("user", "user");
        userInfo.put("authorities", "roles");
        return userInfo;
	}
	
	@RequestMapping(value="/auth/user/logout/{tokenValue}",produces = "application/json")
	public String logout(@PathVariable String tokenValue) {
		defaultTokenServices.revokeToken(tokenValue);
        return tokenValue;
	}
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("123456"));
	}
}
