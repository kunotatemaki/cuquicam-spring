package com.rukiasoft.serverapps.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rukiasoft.serverapps.domain.User;
import com.rukiasoft.serverapps.persistence.UserMapper;

public class CuquiCamMethodsInternal {
	
	@Autowired
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}


	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}


	public List<User> getAllUsers(){
		List<User> users = userMapper.getUsers();
		return users;
	}
	
}
