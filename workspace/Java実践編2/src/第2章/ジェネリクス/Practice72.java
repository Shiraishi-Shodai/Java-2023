package 第2章.ジェネリクス;

public class Practice72 {
	public static void main(String[] args) {
		Student s = new Student(1, "河原太郎", "松山市", 2000, 1, 29);
		//①Boxクラスのインスタンスb1を生成し、インスタンスsを格納する
		Box<Student> b1 = new Box<Student>(s);
		System.out.println(b1.get());

		String name = "河原太郎";
		//③Boxクラスのインスタンスb2を生成し、文字列nameを格納する
		Box<String> b2 = new Box<String>("name");
		System.out.println(b2.get());

	}
}
