package 第2章.ジェネリクス;


public class Exam implements Cloneable {
	private String name;

	public Exam clone() {
		Exam result = new Exam();
		result.name = this.name;
		return result;
	}

	public Exam() {
	}

	public Exam(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
