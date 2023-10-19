package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeesDAO {

	private final String JDBC_URL = "jdbc:mysql://localhost/employee";
	private final String DB_USER = "example2";
	private final String DB_PASS = "pyp8)9bs@L]C6Yq*";
	
	public List<Employee> findAll(){ 
		
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			
			throw new IllegalStateException("JDBCドライバがみつかりません");
		}
		
		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)){
			
			String sql = "SELECT * FROM Employee";
			PreparedStatement pSmt = conn.prepareStatement(sql);
			ResultSet rs = pSmt.executeQuery();
			
			while(rs.next()) {
				
				String password = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");	
				Employee e = new Employee(password, name, age);
				
				list.add(e);

			}
		}catch(SQLException e) {
			
			e.printStackTrace();
			return null;
		}
		
		return list;
	}
}
