package com.commer.app.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.commer.app.entity.User;

@Component
public interface UserMapper {
	
	int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    //根据用户id获取用户信息
    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	/**
	 * 系统管理员登录后台系统认证方法
	 */
	User checkAdministratorsUser(@Param("username") String username, @Param("password") String password);
}
