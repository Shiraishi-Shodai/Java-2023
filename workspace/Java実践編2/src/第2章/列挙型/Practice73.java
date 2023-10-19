package 第2章.列挙型;

public class Practice73 {
	public static void main(String[] args) {
		Student s1 = new Student(1, "河原太郎", "松山市", 2000, 1, 29,courseType.ITE3); //①学科としてITE3を指定);
		System.out.println(s1);
		Student s2 = new Student(2, "河原花子", "伊予市", 1999, 11, 10,courseType.GC); //②学科としてGCを指定);
		System.out.println(s2);
	}
}
