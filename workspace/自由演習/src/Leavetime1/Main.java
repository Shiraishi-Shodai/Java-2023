package Leavetime1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	  public static void main(String[] args) {
		  
		  Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		  int hour = 0;
		  int minutes = 0;
		  long box;
		  Func func = new Func();
		  FileWriter fw = null;
		  
		  try (BufferedReader r = new BufferedReader(new FileReader("leavetime1.txt"));){
			  	fw = new FileWriter("leavetime1.txt",true);
			  	String line;
			  	//日付を追加
			  	int i = 1;
	
			  	while((line = r.readLine()) != null) {
			  		//s[0]に名前,s[1]に時間が入る
			  		String s[] = line.split("[ :]");
			  		String name = s[0];
			  		//時間をStringからintに変換
			  		hour = Integer.parseInt(s[1]);
			  		minutes = Integer.parseInt(s[2]);
			  		
			  		if(hour < 10) {
			  			hour+=24;
			  		//既にmapに登録している名前ならtreu,そうでないならfalse
				  		if(func.call(map, name)) {
				  					
				  		}else {
				  			
				  			System.out.println(name+"を格納しました");
				  		}
			  		}
			  		
			  	}
//			  	//書式用意
//			  	final String FORMAT = "%-10s %d hours %d minutes";
//			  	
//			  	//表示
//			  	for(String key : map.keySet()) {
//			  		LocalTime v = map.get(key);
//			  		String s = String.format(FORMAT, key,v.getHour(),v.getMinute());
//			  		System.out.println(s);
//			  	}
		  }catch(IOException e) {
			  	System.out.println("エラー1");
		  }finally{
			  try {
				  if(fw!=null) {
					  fw.close();
				  }
			  }catch(IOException e) {
				  e.fillInStackTrace();
			  }
			  
		  }
		  
		  
	  }
	}