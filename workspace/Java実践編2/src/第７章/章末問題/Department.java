package 第７章.章末問題;

import java.io.Serializable;

public class Department implements Serializable{
	String name;
	Employee leader;
	
	public Department(String name,Employee e) {
		this.name = name;
		this.leader = e;
	}
}
