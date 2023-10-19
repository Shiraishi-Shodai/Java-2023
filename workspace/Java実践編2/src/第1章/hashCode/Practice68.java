package 第1章.hashCode;

import java.util.HashSet;
import java.util.Set;

public class Practice68 {

	public static void main(String[] args) {
		Student s1 = new Student("河原太郎", "松山市", 2000, 1, 23);
		Student s2 = new Student("河原太郎", "宇和島市", 2000, 1, 23);
		Student s3 = new Student("河原太朗", "松山市", 2000, 1, 23);
		Student s4 = new Student("河原太郎", "松山市", 1999, 10, 11);

	    Set<Student> list = new HashSet<>();
	    list.add(s1);
	    list.add(s2);
	    list.add(s3);
	    list.add(s4);
	    System.out.println("削除前　要素数=" + list.size());
	    
	    Student del = new Student("河原太郎", "宇和島市", 2000, 1, 23);
		System.out.println("s1のハッシュコード = " + s1.hashCode());
		System.out.println("s2のハッシュコード = " + s2.hashCode());
		System.out.println("s3のハッシュコード = " + s3.hashCode());
		System.out.println("s4のハッシュコード = " + s4.hashCode());
		System.out.println("delのハッシュコード = " + del.hashCode());
	    //①リストからdelインスタンスを削除する;
		list.remove(del);
	    System.out.println("削除後　要素数=" + list.size());
	}

}
