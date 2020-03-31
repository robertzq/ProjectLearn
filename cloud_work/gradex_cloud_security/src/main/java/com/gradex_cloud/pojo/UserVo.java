package com.gradex_cloud.pojo;

import java.util.Date;
import java.util.List;

public class UserVo extends BaseVo {
	private String userName;
	private List<ResourceVo> resources;
	private List<String> roleList;
	private List<String> roleIdList;
	private int id;
	private String userAccount;
	private String pwd;

	private String deptCode;
	private String deptName;
	private String deptId;

	private String isActive;
	private String deptType;
	private String roleName;

	private String loginTime;
	private String newPass;
	private String comfirPass;
	private String licensenumber;
	private String address;
	private String telephone;
	private String email;
	private String licenseIsActive;
	private Date createTime;
	private Date lastUpdateTime;
	private String vciNo;
	private String barCode;
	private String repairStationCode;
	private String repairStationName;
	private String remark;
	private String company;
	private String token;
	private List<String> access;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	private Integer errorCount;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public List<ResourceVo> getResources() {
		return resources;
	}

	public void setResources(List<ResourceVo> resources) {
		this.resources = resources;
	}

	public boolean hasAuth(String menuId, String auth) {
		boolean has = false;
		for (ResourceVo resource : resources) {
			if (String.valueOf(resource.getParentId()).equals(menuId) && auth.equals(resource.getUrlPattern())) {
				has = true;
				break;
			}
		}
		return has;
	}

	public List<String> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<String> roleList) {
		this.roleList = roleList;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptType() {
		return deptType;
	}

	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public String getComfirPass() {
		return comfirPass;
	}

	public void setComfirPass(String comfirPass) {
		this.comfirPass = comfirPass;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	public Integer getErrorCount() {
		return errorCount;
	}

	public String getLicensenumber() {
		return licensenumber;
	}

	public void setLicensenumber(String licensenumber) {
		this.licensenumber = licensenumber;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public List<String> getRoleIdList() {
		return roleIdList;
	}

	public void setRoleIdList(List<String> roleIdList) {
		this.roleIdList = roleIdList;
	}

	public String getLicenseIsActive() {
		return licenseIsActive;
	}

	public void setLicenseIsActive(String licenseIsActive) {
		this.licenseIsActive = licenseIsActive;
	}

	public String getVciNo() {
		return vciNo;
	}

	public void setVciNo(String vciNo) {
		this.vciNo = vciNo;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getRepairStationCode() {
		return repairStationCode;
	}

	public void setRepairStationCode(String repairStationCode) {
		this.repairStationCode = repairStationCode;
	}

	public String getRepairStationName() {
		return repairStationName;
	}

	public void setRepairStationName(String repairStationName) {
		this.repairStationName = repairStationName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public List<String> getAccess() {
		return access;
	}

	public void setAccess(List<String> access) {
		this.access = access;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


	
	
}
