
public class Student {
	private String name;
	private int javaScore;
	private int htmlScore;
	private int dbScore;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int java,int html,int db) {
		this.javaScore = java;
		this.htmlScore = html;
		this.dbScore = db;
	}
	
	public int getScore() {
		return (this.javaScore+this.htmlScore+this.dbScore);
	}
	public String getName() {
		return this.name;
	}
}
