package 第3章.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice78 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "河原太郎", 80));
		list.add(new Student(2, "山田花子", 50));
		list.add(new Student(3, "鈴木一郎", 60));
		list.add(new Student(4, "佐藤次郎", 70));
		list.add(new Student(5, "高橋博美", 90));
		list.add(new Student(6, "近藤京子", 40));

		System.out.println("全ての学生");
		for (Student a : list) {
			System.out.println(a);
		}

		System.out.println("60点以上の学生");
		//①リストから得点が６０点以上の学生をすべて取り出してresult1リストに格納
		List<Student> result1 = list.stream().filter(s -> s.getScore() >= 60).collect(Collectors.toList());
			
		for (Student a : result1) {
			System.out.println(a);
		}
		
		System.out.println("最高得点者");
		//②リストから最高得点の学生を取り出してresult2に格納
		Optional<Student> result2 = list.stream().max((x,y) -> x.getScore() - y.getScore());
		System.out.println(result2.get());

		System.out.println("最低得点者");
		//③リストから最低得点の学生を取り出してresult3に格納
		Optional<Student> result3 = list.stream().min((x,y) -> x.getScore() - y.getScore());
		System.out.println(result3.get());
	}
}
