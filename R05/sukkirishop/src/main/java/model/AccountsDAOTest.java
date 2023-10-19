package model;

import java.sql.SQLException;

import DAO.DAO;

public class AccountsDAOTest {
	
	public static void main(String args[]) throws SQLException {
		
		testFindByLogicOK();
		testFindByLogicNG();
	}
	
	public static void testFindByLogicOK() throws SQLException {
		
		Login login = new Login("minato", "1234");
		DAO dao = new DAO();
		Account account = dao.findByLogin(login);
		
		if(account != null && account.getUserId().equals("minato") && account.getPass().equals("1234")) {
			System.out.println("ログイン成功しました");
		}else {
			System.out.println("ログイン失敗しました");
		}
	}
	
	public static void testFindByLogicNG() throws SQLException {
		
		Login login = new Login("minato", "1234");
		DAO dao = new DAO();
		Account account = dao.findByLogin(login);
		
		if(account == null) {
			System.out.println("testFindByLogicNG:成功しました");
		}else {
			System.out.println("testFindByLogicNG:失敗しました");
		}
	}
	
	
}
