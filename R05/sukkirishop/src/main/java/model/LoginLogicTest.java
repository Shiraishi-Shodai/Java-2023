package model;

import java.sql.SQLException;

import DAO.DAO;

public class LoginLogicTest {

	public static void main(String args[]) throws SQLException {
		
		testExecuteOK();
		testExecuteNG();
	}
	
	public static void testExecuteOK() throws SQLException {
		
		Login login = new Login("minato", "1234");
		DAO dao = new DAO();
		LoginLogic logic = new LoginLogic();
		boolean bo = logic.execute(login);
		
		if(bo) {
			System.out.println("testExecuteNG:成功しました");
		}else {
			System.out.println("testExecuteNG:失敗しました");
		}
	}
	
	public static void testExecuteNG() throws SQLException {
		
		Login login = new Login("minato", "1234");
		DAO dao = new DAO();
		LoginLogic logic = new LoginLogic();
		boolean bo = logic.execute(login);
		
		if(!bo) {
			System.out.println("testExecuteNG:成功しました");
		}else {
			System.out.println("testExecuteNG:失敗しました");
		}
	}
}
