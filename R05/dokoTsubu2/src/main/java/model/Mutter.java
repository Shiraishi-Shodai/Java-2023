package model;

import java.io.Serializable;

public class Mutter implements Serializable{
	
	private User user;
	private String text;
	
	public Mutter(User user,String text){
		this.user = user;
		this.text = text;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public String getText() {
		return this.text;
	}
}
