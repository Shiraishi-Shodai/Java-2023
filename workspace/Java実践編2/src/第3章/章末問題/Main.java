package 第3章.章末問題;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main (String[]args) {
		FuncList f = new FuncList();
//		Function1 f1 = FuncList::isOdd;
//		Function2 f2 = f::passCheck;
//		
//		f1.call(0);
//		f2.call2(0, "a");
		
//		Function1 f1 = x -> x % 2 == 1;
//		Function2 f2 = (x,y) -> {
//			return y + "さんは" + (x > 65 ? "合格" : "不合格");
//		};
		List<String> names = new ArrayList<>();
		names.add("あいう");
		names.add("あい");
		names.add("あいうe");
		names.add("あいうeo");
		names.stream().filter(n -> n.length() <= 4).map(n -> n + "さん").forEach(System.out::println);
	}
}