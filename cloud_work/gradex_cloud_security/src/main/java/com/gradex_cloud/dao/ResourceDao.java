package com.gradex_cloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gradex_cloud.pojo.ResourceVo;

/**
 * @author 资源表dao
 *
 */
@Mapper
public interface ResourceDao {

	/**
	 * 得到所有的资源
	 * @return
	 */
	public List<ResourceVo> getAllResource();

}
