package com.gradex_cloud.pojo;

import java.util.List;

public class ResourceVo {
	private String id;//资源id
	private String urlPattern;//url
	private String resourceType;//类型
	private String resourceDesc;
	private String parentId;
	private String role;//角色id
	private List<String> operations;
	private String resourceCode;//资源标识码
	public ResourceVo(){
	}
	public ResourceVo(String url,String role){
		this.urlPattern=url;
		this.role=role;
	}
	public String getResourceCode() {
		return resourceCode;
	}
	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrlPattern() {
		return urlPattern;
	}
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public String getResourceDesc() {
		return resourceDesc;
	}
	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getOperations() {
		return operations;
	}
	public void setOperations(List<String> operations) {
		this.operations = operations;
	}
}
