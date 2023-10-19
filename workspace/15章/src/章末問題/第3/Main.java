package 章末問題.第3;

public class Main {
	public static void main(String[]args) {
		
		String a = "A1 ";
		String b = "Uaa";
		if(a.matches(".*")) {
			System.out.println("すべて一致");
		}
		
		if(a.matches("^[A]\\d[\\s|\\d]")) {
			System.out.println("一致");
		}
		
		if(a.matches("^[U][A-Z]{3}")) {
			System.out.println("一致した");
		}
	}
}
