package 第3章.Stream;

public class Student {
	private int no;			//番号
	private String name;	//氏名
	private int score;		//得点

	public Student() {

	}

	public Student(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return "学生情報  出席番号：" + this.no + ", 氏名：" + this.name + ", 得点：" + this.score;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}