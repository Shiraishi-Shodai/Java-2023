package 教科書練習問題.問2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		var map = new LinkedHashMap<Hero,Integer>();
		
		Hero h1 = new Hero("ミナト");
		Hero h2 = new Hero("アサカ");
		list.add(h1);
		list.add(h2);
		//System.out.printf("一人目%s,二人目%s",list.get(0).getName(),list.get(1).getName());
		
		map.put(h1, 7);
		map.put(h2, 3);
		for(Hero key: map.keySet()) {
			System.out.printf("名前%s倒した数%s\n",key.getName(),map.get(key));
		}
		
	}
}
