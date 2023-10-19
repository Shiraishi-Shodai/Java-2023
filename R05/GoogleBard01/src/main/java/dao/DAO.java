package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;

public class DAO {
	
	private final String JDBC_URL = "jdbc:mySQL://localhost/googlebard01";
	private final String DB_USER = "googlebard";
	private final String DB_PASS = "google";
	
	public boolean insertData(User user) {
		
		boolean flag = true;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println("接続エラー");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			
			String sql = "INSERT INTO USERS(NAME, MAIL, PASS) VALUES(?, ?, ?)";
			
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			pStmt.setString(1, user.getName());
			pStmt.setString(2, user.getMail());
			pStmt.setString(3, user.getPass());
			
			int rs = pStmt.executeUpdate();
			
			if(rs != 1) {
				flag = false;
			}
		}catch(SQLException e) {
			System.out.println("セットエラー");
		}
		
		return flag;
	}
	

	
}
