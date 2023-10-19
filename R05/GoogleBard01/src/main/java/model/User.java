package model;

import java.io.Serializable;

public class User implements Serializable{
	
	private String name;
	private String mail;
	private String pass;
	

	public User(String name, String mail, String pass) {
		this.name = name;
		this.mail = mail;
		this.pass = pass;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
