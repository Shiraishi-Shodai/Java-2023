
public class Student {
	int no;
	String name;
	int age;
	//①静的なint型フィールドcounterを宣言し、0で初期化
	static int counter=0;

	public Student(String name, int age) {
		//②counterに1加算し、フィールドnoにセットする
		this.no = ++Student.counter; //++をcounterの後ろにつけるとthis.noに代入してからカウントアップすることとなる
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "出席番号は" + this.no + "、名前は" + this.name + "、年齢は" + this.age + "才です。";
	}
}
