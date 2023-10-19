package TelCheck;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String [] telno = {"03-1111-2222","(03)3333-4444","070-5555-6666","0120-222-222","050-7777-8888","080-3300-5680","090-2233-4455","089-950-1234",
				"0895-73-3355","087-834-9114","04996-2-1122", "0-1111-2222","03-111-2222","03-1111-222","031-1111-2222","03-11111-2222","03-1111-22221",
				"0X-1111-2222","03-111X-2222", "03-1111-222X","03A1111-2222","189-911-1111"};
		String phone ="";
		String character = "";
		//String result ="不正な電話番号";
		 //固定電話のパターンを生成
	    Pattern kotei = Pattern.compile("^\\d{6}-\\d{4}$");
	    //3桁４桁４桁のパターンを生成
	    Pattern frame = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
	    //フリーダイヤルのパターンを生成
	    Pattern free = Pattern.compile("[0120]-\\d{3}-\\d{3}");
		System.out.println("電話番号チェック");
		for(int i = 0;i<telno.length;i++) {
			String result ="不正な電話番号";
				//phoneを初期化
				phone = "";
				String []box = telno[i].split("");
				
				for(int j = 0;j<box.length;j++) {
					//box[i]が数字とハイフンの時phoneに追加
					if(box[j].matches("[\\d|-]")) {
						phone += box[j];
					}
					//box[i]が)の時はハイフンをphoneに追加
					if(box[j].matches("[)]")) {
						phone += "-";
					}
				}
			   
			    Matcher m2 = frame.matcher(phone);
			    Matcher m3 = free.matcher(phone);
			  //先頭1文字を取得
		    	character = phone.substring(0,1);
		    	//先頭1文字が0の時true,そうでないときfalse
		    	if(character.equals("0")) {	 
				    	
				    	//固定電話の処理
						int count = 0;
						String landLine = "";
						String sep [] = phone.split("");
							//phoneをハイフンでに分割する
							for(int k = 0;k<sep.length;k++) {
								if(sep[k].matches("[-]")) {
									//1つ目のハイフンはスルー
									if(count == 0) {
										count++;
										continue;
									}
									
								}
								landLine += sep[k];
							}
							Matcher m = kotei.matcher(landLine);
							System.out.println("landLine:"+landLine);
							//5桁と４桁に分割できたらtrue,そうでないならfalse
							if(m.find()) {
								result = "固定電話";
								for(int k = 0;k<sep.length;k++) {
									if(sep[k].matches("[A=Z]")) {
										result = "不正な電話番号";
										break;
									}
								}
							}
							//3桁４桁４桁の時true,そうでないときfalse
					    	if(m2.find()) {
						    		//先頭３文字を取得
						    		character = phone.substring(0,3);
						    		switch(character) {
						    		case "080":
						    		case "090":
						    			result = "携帯電話";
						    			break;
						    		case "070":
						    			result = "携帯電話/PHS";
						    			break;
						    		case "050":
						    			result = "IP電話";
						    			break;
						    		}
					    	}
							//フリーダイヤル判定
							if(m3.find()) {
								result = "フリーダイヤル";
							}
			    }
		    System.out.printf("%s___%s\n", telno[i],result);
		}

	}
}
