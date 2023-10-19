package 演習問題;

import static java.lang.System.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class RegExpSub {
	private boolean flag = true;
	public boolean setNumber(String []num) {
		
			if(!(num[0].matches("[1-6]"))) {
				out.println("error!");
				return false;
			}else if(!(num[1].matches("[1-4]"))){
				out.println("error!");
				return false;
			}

		return flag;
	}
	public boolean setName(String []num,int space) {
		//flagをtrueで初期化
		this.flag = true;
		//頭文字配列

		//その他配列
		List<String> list = new LinkedList<String>();
		//String [] box = new String[num.length-2];
		//boxに頭文字以外を格納
		for(int i = 0;i<num.length;i++) {
			//iが頭文字の要素番号じゃないとき、boxに値を格納
			if(i != 0 && (i != space+1) && i != space) {
				list.add(num[i]);
			}
		}
		//頭文字が大文字以外の時、falseを返す
		if(!(num[0].matches("[A-Z]")||num[space+1].matches("[A-Z]"))){
			out.println("error!です");
			return false;
		}
		//2文字目以降が大文字以外の時、falseを返す
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			if(!it.next().matches("[a-z]")) {
				out.println("error!だよ");
				 return false;
			}
		}
		
		return flag;
		
		
	}

}
