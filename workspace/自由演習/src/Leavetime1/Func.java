package Leavetime1;

import java.util.Map;

public class Func {
	private boolean flag = false;
	public boolean call(Map<String,Integer> map,String name) {
		this.flag = false;
		for(String key : map.keySet()) {
			if(name.equals(key)) {
				return flag = true;
			}
		}
		return flag;
	}
}
