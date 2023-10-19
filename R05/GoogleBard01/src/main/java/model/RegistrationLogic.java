package model;

import dao.DAO;

public class RegistrationLogic {
	
	String message = "";
	
	public String execute(User user) {
		
		DAO dao = new DAO();
		boolean flag = dao.insertData(user);
		
		if(flag) {
			message = "成功";
		}else {
			message = "失敗";
		}
		
		return message;
	}
	
	
}
