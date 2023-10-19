package Practice49;

public class Student {
	String name;
	int age;
	//①静的なint型フィールドcounterを宣言し、0で初期化
	int counter = 0;

	public Student(String name, int age) {
		counter++;//②counterに1加算し、フィールドnoにセットする
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "出席番号は" + this.counter + "、名前は" + this.name + "、年齢は" + this.age + "才です。";
	}
}

