package com.gradex_cloud.pojo;

/**
 * 认证vo
 * @author ZQA4SGH
 *
 */
public class AuthenticationBean {

	private String j_username;
	private String j_password;
	
	public AuthenticationBean() {
		super();
	}
	public AuthenticationBean(String j_username, String j_password) {
		super();
		this.j_username = j_username;
		this.j_password = j_password;
	}
	public String getJ_username() {
		return j_username;
	}
	public void setJ_username(String j_username) {
		this.j_username = j_username;
	}
	public String getJ_password() {
		return j_password;
	}
	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}
	
	
}
