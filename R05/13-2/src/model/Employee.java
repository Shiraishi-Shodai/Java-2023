package model;

public class Employee {
	
	private String id;
	private String name;
	private int age;
	
	public Employee(String id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
