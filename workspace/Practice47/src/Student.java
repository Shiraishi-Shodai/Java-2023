
public class Student {
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//②toStringメソッドをオーバーライド
	public String toString(int a) {
		return "名前"+this.name+"年齢"+age+a;
	}
}
