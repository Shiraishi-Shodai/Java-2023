
public class Student {
	int no;
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//②equalsメソッドをオーバーライド　引数Object型o
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		/*もし、変数oをStudent型の箱に代入可能なら下記の処理を実行する	
			※同じクラス型、もしくはサブクラスかどうか*/
		if (o instanceof Student) {
			//互換性が確認出来たら、値をチェックするオブジェクトをこのクラスの型にキャストする(s2をsとして扱う)
			Student s = (Student) o;
			/*同値である事の条件を定義する。
			それぞれのオブジェクトの変数ageと変数nameを比較している。*/
			if(this.name.equals(s.name)&&this.age==s.age){
				return true;
			}
		}
		return false;
	}
}
