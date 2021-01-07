package com.purvar.springboot.api.dto;

import io.swagger.annotations.ApiModelProperty;

public class User {
	@ApiModelProperty(value = "用户ID", hidden = true)
	private String id;
	@ApiModelProperty(value = "用户名")
	private String name;
	@ApiModelProperty(hidden = true)
	private String password;
	@ApiModelProperty(value = "年龄")
	private int age;
	public String getId() {
		return "0001";
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return "lidawei";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return "pwd123";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return 30;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
