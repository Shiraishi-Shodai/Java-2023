package 文字列の書式整形;

public class Practice54 {
	public static void main(String[] args) {
		String[] name = { "yamada taro", "sawa kouichiro", "suzuki hanako" };
		int[] java = { 100, 68, 9 };
		int[] html = { 51, 8, 100 };
		int[] sql = { 7, 100, 79 };
		System.out.println("formatを利用して表示");
		final String FORMAT = "%-15s %5d %5d %5d";
		System.out.println("name                 java html sql");
		System.out.println("----------------------------------");
		for (int i = 0; i < name.length; i++) {
			String s = String.format(FORMAT,name[i],java[i],html[i],sql[i]);
			System.out.println(s);
		}
		System.out.println("\nprintfを利用して表示");
		System.out.println("name                 java html sql");
		System.out.println("----------------------------------");
		for (int i = 0; i < name.length; i++) {
			//③printfで書式整形し出力する。
			System.out.printf("%-15s %5d %5d %5d \n",name[i],java[i],html[i],sql[i]);
		}
	}
}
