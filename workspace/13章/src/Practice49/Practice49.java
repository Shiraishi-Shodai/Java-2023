package Practice49;

import java.util.Scanner;

public class Practice49 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("名前：");
			String name = stdIn.next();
			System.out.print("年齢：");
			int age = stdIn.nextInt();
			Student s = new Student(name, age);

			System.out.println(s.toString());
		}
	}

}

