package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MuttersDAO {

	private final String JDBC_URL = "jdbc:mySQL://localhost/dokotsubu";
	private final String DB_USER = "root";
	private final String DB_PASS = "pathSQL";
	
	public List<Mutter> findAll(){
		
		List<Mutter> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println("ドライバーエラー");
			throw new IllegalStateException("ドライバーエラー");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){
			
			String sql = "SELECT * FROM MUTTERS ORDER BY ID DESC";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("ID");
				String name = rs.getString("NAME");
				String text = rs.getString("TEXT");
				Mutter mutter = new Mutter(id, name, text);
				list.add(mutter);
				
			}
		}catch(SQLException e) {
			
			System.out.println("その他エラー");
			e.printStackTrace();
			
		}
		
		return list;
	}
	

	public boolean insert(Mutter mutter){
		
		boolean judge = true;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			throw new IllegalStateException("ドライバーエラー");
		}
		
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){
//			? = プレースホルダー(場所を確保）
			String sql = "INSERT INTO MUTTERS(NAME, TEXT)"
					+ "VALUES(?, ?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, mutter.getUserName());
			pStmt.setString(2, mutter.getText());
			int flag = pStmt.executeUpdate();
			
			if(flag != 1) {
				judge =  false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("a");
		return judge;
	}
	
}
