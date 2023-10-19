
import java.util.Scanner;

public class Practice47 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("名前：");
		String name = stdIn.next();
		System.out.print("年齢：");
		int age = stdIn.nextInt();
		Student s = new Student(name, age);

		System.out.println(s);
	}
}
