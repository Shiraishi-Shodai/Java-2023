
import java.util.Scanner;

public class Practice48 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.print("名前１：");
		String name1 = stdIn.next();
		System.out.print("年齢１：");
		int age1 = stdIn.nextInt();
		Student s1 = new Student(name1, age1);
		
		System.out.print("名前２：");
		String name2 = stdIn.next();
		System.out.print("年齢２：");
		int age2 = stdIn.nextInt();
		Student s2 = new Student(name2, age2);
		
		if (!s1.equals(s2)) {
			System.out.println("別人です。");
		} else {
			System.out.println("同じ人です。");
		}
	}
}
