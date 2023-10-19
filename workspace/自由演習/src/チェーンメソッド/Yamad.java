package チェーンメソッド;

public class Yamad {
	String name;
	int age;
	Yamad setName(String name) {
		this.name = name;
		 return this;
	}
	Yamad setAge(int age) {
		this.age = age;
		return this;
	}
	void show() {
		System.out.println(this.name+this.age);
	}
}
