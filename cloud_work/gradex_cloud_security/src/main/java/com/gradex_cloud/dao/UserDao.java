package com.gradex_cloud.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import com.gradex_cloud.pojo.ResourceVo;
import com.gradex_cloud.pojo.UserVo;
@Mapper
public interface UserDao {
	/**
	 * 根据用户登录名得到用户
	 * @param userAccount
	 * @return
	 */
	public UserVo getUserByUsername(@Param("userAccount")String userAccount);

	/**
	 * 根据用户登录名得到用户拥有的所有角色
	 * @param userAccount
	 * @return
	 */
	public List<String> getUserRolesByUserAccount(String userAccount);
	
	public List<String> getUserRolesIdByUserAccount(String userAccount);

	
	/**
	 * 根据用户登录名得到用户拥有的所有角色
	 * @param level 
	 * @param userAccount
	 * @return
	 */
	public List<UserVo> getUserAllInfoById(@Param("id")Integer id,@Param("level") Integer level,@Param("condition")String condition);
	
	/**
	 * 获取一个用户拥有的所有资源
	 * @param map
	 * @return
	 */
	public List<ResourceVo> getUserResources(Map<String, Object> map);

	/**
	 * 去重用户所有资源
	 * @param map
	 * @return
	 */
	public List<ResourceVo> getUserResourcesMenu(Map<String, Object> map);
	
	/**
	 *  注册新的用户。
	 *  @param UserVo : 注册的用户
	 *  @return
	 */
	public void registerUser(@Param("newUser")UserVo newUser);

	public void resetUserPwd(@Param("account")String account,@Param("pwd") String pwd);
	
	public void updateUserByPrimaryKey(@Param("isActive")String isActive,@Param("id") String id);
	
	/**
	 * give a role some authority
	 * @param id
	 * @param roleId
	 */
	public void insertUserRole(@Param("userId")String id,@Param("roleId") String roleId);



	/**
	 * 根据角色id删除角色
	 * @param id
	 */
	public void deleteRoleById(@Param("id")int id);




	
	
	/**
	 * get user little information by Account
	 * @param level 
	 * @param roleVo
	 */
	public List<UserVo> getlittleInfoByCondition(@Param("conditions")UserVo conditions, @Param("level")Integer level);

	
	/**
	 * get user little information by Account
	 * @param roleVo
	 */
	public void updateUserInfoByAccount(@Param("Info")UserVo Info);

	/**
	 * 插入用户的新角色
	 * @param userVo
	 * @return
	 */
	public int insertUserRoleRelation(@Param("userVo")UserVo userVo);

	/**
	 * 删除userid 下关联的所有角色id
	 * @param id 用户id
	 */
	public void deleteUserRoleRelation(@Param("id")Integer id);



	public int deleteUserById(@Param("id")int id);
	
	public int deleteLicenseNumberByUserId(@Param("id")int id);

	public int getUserNameCount(@Param("account")String userAccount);
	
	/**
	 * add a new license number
	 * @param newUser
	 */
	public void addLicenseNumber(@Param("newUser") UserVo newUser);

	/**
	 * change a license number
	 * @param newUser
	 */
	public void changeLicenseNumber(@Param("newUser") UserVo newUser);
	
	/**
	 * delete a license number
	 * @param newUser
	 */
	public void deleteLicenseNumber(@Param("newUser") UserVo newUser);
	
	/**
	 * get a license number
	 * @param newUser
	 */
	public void getLicenseNumber(@Param("newUser") UserVo newUser);
	
	/**
	 * update a old license number
	 * @param Info
	 */
	public void updateLicenseNumber(@Param("Info")UserVo Info);
	
	/**
	 * get license info by userId
	 */
	public UserVo getLicenseInfoByUserId(@Param("id") int id);

	public void batchInsertUserList(@Param("list")List<UserVo> list);

	public List<Integer> getUserRoleList(@Param("id")String id);
	
	
	 @Update("UPDATE G_USER SET USERPASSWORD=#{info.newPass,jdbcType=VARCHAR} WHERE USERACCOUNT = #{info.userAccount,jdbcType=VARCHAR}")
	 public void updateUserPassword(@Param("info")UserVo userVo);
	 
	 @Select("SELECT USERPASSWORD pwd FROM G_USER WHERE USERACCOUNT = #{info.userAccount,jdbcType=VARCHAR}")
	 public String  getUserOldPassword(@Param("info")UserVo userVo);



	public int getActiveUserCount();

	
}