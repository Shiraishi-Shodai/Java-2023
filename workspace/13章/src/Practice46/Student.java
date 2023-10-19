package Practice46;

public class Student {
	private String name;
	private int javaScore;
	private int htmlScore;
	private int dbScore;
	public Student(){
		
	}
	Student(String name) {
		this.name = name;
	}

	int total() {
		return this.javaScore + this.htmlScore + this.dbScore;
	}
	
	public int getterTotal() {
		return this.javaScore+this.htmlScore+this.dbScore;
	}
	public String getterName() {
		return this.name;
	}
	public void setterTotal(int java,int html,int db) {
		this.javaScore = java;
		this.htmlScore = html;
		this.dbScore = db;
	}
	public void setterName(String name) {
		this.name = name;
	}
	
}

