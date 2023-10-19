package 第1章.CompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice69 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "河原太郎", "松山市", 2000, 1, 23);
		Student s2 = new Student(2, "河原太郎", "宇和島市", 2000, 1, 23);
		Student s3 = new Student(3, "河原太朗", "松山市", 2000, 1, 23);
		Student s4 = new Student(4, "河原太郎", "松山市", 1999, 10, 11);
		list.add(s4);
		list.add(s3);
		list.add(s2);
		list.add(s1);

		System.out.println("ソート前：");
		for (Student a : list) {
			System.out.println(a);
		}

		//①リストをソート（整列）する
		Collections.sort(list);
		
		System.out.println("ソート後：");
		for (Student a : list) {
			System.out.println(a);
		}
	}
}
