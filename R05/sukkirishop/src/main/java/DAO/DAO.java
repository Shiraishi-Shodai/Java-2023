package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;
import model.Login;

public class DAO {
	
	private final String JDBC_URL = "jdbc:mySQL://localhost/sukkirishop";
	private final String DB_USER = "root";
	private final String DB_PASS = "pathSQL";
	
	public Account findByLogin(Login login) throws SQLException {
		
		Account account = new Account();
		
		boolean flag = true;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println("接続エラー");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			
			String sql = "SELECT * FROM ACCOUNT WHERE USER_ID = ? AND PASS = ?";
			
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, login.getUserId());
			pStmt.setString(2, login.getPass());
			
			ResultSet result = pStmt.executeQuery();
			
			
			if(result.next()) {
				
				String userId = result.getString("USER_ID");
				String pass = result.getString("PASS");
				String mail = result.getString("MAIL");
				String name = result.getString("NAME");
				int age = result.getInt("AGE");
				
				account = new Account(userId, pass, mail, name, age);
			}
		}catch(SQLException e) {
			System.out.println("取得エラー");
			return null;
		}
		
		return account;
	}
}
