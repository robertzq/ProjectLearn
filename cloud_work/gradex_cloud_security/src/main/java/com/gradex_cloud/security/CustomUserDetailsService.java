package com.gradex_cloud.security;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gradex_cloud.dao.UserDao;
import com.gradex_cloud.pojo.ResourceVo;
import com.gradex_cloud.pojo.UserVo;

@Configuration
public class CustomUserDetailsService implements UserDetailsService {
	
	private static Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);
	@Autowired
	private UserDao userDao;
	/**
	 * 根据登陆的用户名加载用户的所有角色权限
	 * @param
	 * @return
	 * @throws Exception
	 */
	@Override
	public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException{
		UserVo userInfo = new UserVo();
		try {
			
			userInfo=userDao.getUserByUsername(username);
			userInfo.setRoleList(userDao.getUserRolesByUserAccount(username));
			userInfo.setRoleIdList(userDao.getUserRolesIdByUserAccount(username));
			if(userInfo!=null && userInfo.getRoleList()!=null && !userInfo.getRoleList().isEmpty()){
				
				String [] str=(String [])userInfo.getRoleList().toArray(new String[0]);
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("role", str);
				userInfo.setResources(userDao.getUserResources(map));
			}
			
		} catch (Exception e) {
			logger.info("数据库不存在该用户:"+username);
		}
		String password = userInfo.getPwd();
		System.out.println("**********************");
		System.out.println("password "+password);
		System.out.println("**********************");
		if(userInfo.getPwd()==null||"".equals(userInfo.getPwd()))
		{
			throw new UsernameNotFoundException("Can't find the user "+username);
		}
		Set<GrantedAuthority> grantedAuths = obtionGrantedAuthorities(userInfo.getRoleList());
		UserDetails userDetails = new CustomUserDetailVo(username,password, true, true, true, true,
				grantedAuths,obtainResources(userInfo.getResources()));
	
		return userDetails;
	}
	private Set<GrantedAuthority> obtionGrantedAuthorities(List<String> roleNameList) {
		Set<GrantedAuthority> set = new HashSet<GrantedAuthority>();
		for (String roleName : roleNameList) {
			set.add(new SimpleGrantedAuthority(roleName));
		}	
		return set;
	}
	
	private Set<String> obtainResources(List<ResourceVo> list){
		Set<String> resourcesSet =  new HashSet<String>();
		for(ResourceVo resourceName:list) {
			resourcesSet.add(resourceName.getResourceCode());
		}
		return resourcesSet;
	}
}