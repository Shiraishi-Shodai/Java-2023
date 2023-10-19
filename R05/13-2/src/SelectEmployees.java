import java.util.List;

import dao.EmployeesDAO;
import model.Employee;

public class SelectEmployees {
	
	public static void main(String [] args) {
		
		EmployeesDAO dao = new EmployeesDAO();
		List<Employee> list = dao.findAll();
		
		for(Employee e: list) {
			
			System.out.printf("ID%7s, 名前%7s, 年齢%3d \n", e.getid(), e.getName(), e.getAge());
			
		}
	}
}


