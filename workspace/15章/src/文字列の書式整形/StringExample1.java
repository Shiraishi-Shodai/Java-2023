package 文字列の書式整形;
public class StringExample1 {
	public static void main(String[] args) {
		System.out.println("文字列入力:");
		String str = new java.util.Scanner(System.in).nextLine();
		System.out.println("文字列表示");
		System.out.println(str);
		System.out.println("奇数文字目を表示");
		String [] words = str.split("");
		for(int i = 0;i<str.length();i+=2) {
			//System.out.printf("%s",words[i]);
			//System.out.printf("%c",str.charAt(i));
			//System.out.printf("%s",str.substring(i,i+1));
		}
		
	}
}
