package com.gradex_cloud.pojo;

import java.io.Serializable;

/************************************************************
 *@author zhaoqiang
 *This Vo is the base class for other Vos.
 *Include time stamp and change version for Vos.
 *************************************************************/

import java.util.Date;

public class BaseVo implements Serializable{
	
	private Date createTime; //创建时间
	
	private Date lastUpdateTime; //上一个更新时间
	
	private String lastUpdateUser; //上一次变更的用户

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the lastUpdateTime
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * @param lastUpdateTime the lastUpdateTime to set
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * @return the lastUpdateUser
	 */
	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	/**
	 * @param lastUpdateUser the lastUpdateUser to set
	 */
	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	
}
