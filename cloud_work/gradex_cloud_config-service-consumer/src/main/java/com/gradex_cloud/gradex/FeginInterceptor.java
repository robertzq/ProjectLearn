package com.gradex_cloud.gradex;

import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Configuration
public class FeginInterceptor implements RequestInterceptor{

	@Override
	public void apply(RequestTemplate requestTemplate) {
		Map<String,String> headers = getHeaders(getHttpServletRequest());
		for(String headerName : headers.keySet()){
            requestTemplate.header(headerName, getHeaders(getHttpServletRequest()).get(headerName));
        }

		
	}
	private Map<String, String> getHeaders(HttpServletRequest request) {
		 Map<String, String> map = new LinkedHashMap<>();
	        Enumeration<String> enumeration = request.getHeaderNames();
	        while (enumeration.hasMoreElements()) {
	            String key = enumeration.nextElement();
	            String value = request.getHeader(key);
	            map.put(key, value);
	        }
	        return map;

	}
	private HttpServletRequest getHttpServletRequest() {
        try {
            return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
