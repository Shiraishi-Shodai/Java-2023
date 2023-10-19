package 文字列の書式整形;

class Practice {

	public static void main(String[] args) {
		String[] name = { "yamada taro", "sawa kouichiro", "suzuki hanako" };
		int[] java = { 100, 68, 9 };
		int[] html = { 51, 8, 100 };
		int[] sql = { 7, 100, 79 };
		System.out.println("formatを利用して表示");
		//①書式指定文字列を記述
		final String FORMAT = "%-20s %3d %3d %3d";
		System.out.println("name                 java html sql");
		System.out.println("----------------------------------");
		for (int i = 0; i < name.length; i++) {
			String s =  String.format(FORMAT,name[i],java[i],html[i],sql[i]);//②formatで書式整形し、変数sに格納する。
			System.out.println(s);
		}
		System.out.println("\nprintfを利用して表示");
		System.out.println("name                 java html sql");
		System.out.println("----------------------------------");
		for (int i = 0; i < name.length; i++) {
			//③printfで書式整形し出力する。
			System.out.printf("%-20s %3d %3d %3d\n",name[i],java[i],html[i],sql[i]);
		}
	}

}
