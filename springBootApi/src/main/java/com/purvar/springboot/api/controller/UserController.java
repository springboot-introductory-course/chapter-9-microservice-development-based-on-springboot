package com.purvar.springboot.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.purvar.springboot.api.dto.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/user")
@Api(description = "用户管理")
public class UserController {
	@RequestMapping(value="", method=RequestMethod.GET)
	@ApiOperation(value="获取用户列表", notes="获取所有用户信息")
	public String getUserList() {
		return "user connt:10.";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	@ApiOperation(value="添加用户", notes="添加用户信息")
	public String addUser(User user) {
		return "add user.";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ApiOperation(value="获取用户", notes="获取用户信息")
	public User getUser(@ApiParam(value = "用户id", required = true) @PathVariable("id")String id) {
		User user = new User();
		return user;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	@ApiOperation(value="删除用户", notes="删除用户信息")
	public String deleteUser(@ApiParam(value = "用户id", required = true) @PathVariable("id")String id) {
		return "delete user.";
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	@ApiOperation(value="更新获取用户", notes="更新用户信息")
	public String updateUser(@ApiParam(value = "用户id", required = true) @PathVariable("id")String id) {
		return "update user.";
	}
}
