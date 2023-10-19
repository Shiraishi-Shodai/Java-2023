
public class Student {
	private String name;
	private int javaScore;
	private int htmlScore;
	private int dbScore;

	public void setStudent(String name,int javaScore,int htmlScore,int dbScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.htmlScore = htmlScore;
		this.dbScore = dbScore;
	}

	public int getTotal() {
		return this.javaScore + this.htmlScore + this.dbScore;
	}
	
	public String getName() {
		return this.name;
	}
	

	
}
