package 第1章.clone;

import java.util.ArrayList;
import java.util.List;

public class Practice71 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1, "河原太郎", "松山市", 2000, 1, 29);
		Exam e1 = new Exam("基本情報技術者試験");
		s1.setExam(e1);
		
		Student s2 = s1.clone();//①インスタンスs1を複製
		//試験名として『応用情報技術者試験』を格納する
		s2.getExam().setName("応用情報技術者試験");
		Student s3 = s1.clone();//②インスタンスs1を複製
		//試験名として『サーティファイ情報処理技術者能力認定試験１級』を格納する
		s3.getExam().setName("サーティファイ情報処理技術者能力認定試験１級");
		Student s4 = s1.clone();//③インスタンスs1を複製
		//試験名として『サーティファイJavaプログラミング能力認定試験１級』を格納する
		s4.getExam().setName("サーティファイJavaプログラミング能力認定試験１級");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		for (Student a : list) {
			System.out.println(a);
		}
	}
}
