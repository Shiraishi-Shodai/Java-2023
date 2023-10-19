package 第1章.equals;

public class Practice67 {

	public static void main(String[] args) {
		Student s1 = new Student("河原太郎", "松山市", 2000, 1, 23);
		Student s2 = new Student("河原太郎", "宇和島市", 2000, 1, 23);
		Student s3 = new Student("河原太朗", "松山市", 2000, 1, 23);
		Student s4 = new Student("河原太郎", "松山市", 1999, 10, 11);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		if (s1.equals(s2)) {
			System.out.println("s1とs1は同一人物");
		} else {
			System.out.println("s1とs2は別人");
		}
		if (s1.equals(s3)) {
			System.out.println("s1とs3は同一人物");
		} else {
			System.out.println("s1とs3は別人");
		}
		if (s1.equals(s4)) {
			System.out.println("s1とs4は同一人物");
		} else {
			System.out.println("s1とs4は別人");
		}
		if (s1.equals(s1)) {
			System.out.println("s1とs1は同一人物");
		} else {
			System.out.println("s1とs1は別人");
		}
	}

}
