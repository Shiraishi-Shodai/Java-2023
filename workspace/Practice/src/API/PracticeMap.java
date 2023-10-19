package API;

import java.util.HashMap;
import java.util.Map;

public class PracticeMap {
	public static void main(String []args) {
		Map<String,String> mp = new HashMap<>();
		mp.put("shiraishi","白石");
		mp.put("shota", "翔大");
		
		//keySetメソッドでキーを取得
//		for(String key: mp.keySet()) {
//			System.out.println(mp.get(key));
//			
//		}
		//keySetメソッドで値を取得
//		for(String val: mp.values()) {
//			System.out.println(val);
//			
//		}
		//キーと値を一つの拡張for文の中で取得
        for (Map.Entry<String, String> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}
}
