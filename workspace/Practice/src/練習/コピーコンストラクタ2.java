package 練習;

public class コピーコンストラクタ2 {
	int age;
	String name;
	コピーコンストラクタ2(int age,String name){
		this.age = age;
		this.name = name;
		System.out.println("年齢:"+this.age+"名前"+this.name);
	}
	コピーコンストラクタ2(コピーコンストラクタ2 copy){
		this.age = copy.age;
		this.name = copy.name;
		System.out.println("年齢:"+this.age+"名前"+this.name);
	}
}
