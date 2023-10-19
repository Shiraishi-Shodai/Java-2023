package model;

import java.io.Serializable;

public class User implements Serializable{
	private String  name;
	private String  password;
	
	//constract
	public User(String name,String password) {
		this.name = name;
		this.password = password;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public String getPssword() {
		return this.password;
	}
}
