package Trigraph;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trigraph {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("□ 連続する三つの数字あるいは英字から欠けている文字を入力してください。");
		System.out.println("□ たとえば A ? C : と表示されたらBを入力します。");
		System.out.println("□          4 5 ? : と表示されたら6を入力します。");
		System.out.println("★ スペースキーで押下で開始します。");
		//配列alphabetにアルファベットに格納
		String []alphabet = new String[26];
	    char c = 'a';
	    for (int i = 0; i < 26; i++){
	        alphabet[i] = String.valueOf(c++);
	    }
	    //0~9を配列numberに格納
	    String[] number = new String[10];
	    for(int i = 0;i<10;i++) {
	    	number[i] = String.valueOf(i);
	    }
	    //alphabet,numberをリストに格納
	    List<String[]> list = new ArrayList<>();
	    list.add(alphabet);
	    list.add(number);
	    //ランダムを生成
	    SecureRandom rand = new SecureRandom();
	    int x = 0;
	    //表示するStringBuilderを用意
	    StringBuilder sb = new StringBuilder();
	    //正答数カウントを用意
	    int mCount = 0;
	    //入力した内容を格納する変数challengeを用意
	    String challenge = "";
	    //開始時の時間を取得
	    long start = System.currentTimeMillis(); 
	    do {
	    	//アルファベットorナンバーカウント
	    	int judge = rand.nextInt(2);
	       	//はてなランダム
	    	int hatena = rand.nextInt(3);
	    	//はてなカウント
	    	int hCount = 0;
	    	
	    	//もしjudgeが0ならアルファベット、1ならナンバーをランダム表示
	    	if(judge == 0) {
		    		//アルファベットランダム
		        	x = rand.nextInt(alphabet.length-3);
		    	}else {
		    		//numberカウント
			    	x = rand.nextInt(number.length-3);
		    	}
	    	
		    	//解答変数を用意
	    		String answer = "";
	    		//xから三文字ぶんループする
		    	for(int j = x;j<=x+2;j++) {
		    		if(hCount!=hatena) {
		    			sb.append(list.get(judge)[j]+" ");
		    		}else {
		    			//解答を格納
		    			answer = list.get(judge)[j];
		    			sb.append("? ");
		    		}
		    		hCount++;
		    		//もし三回目のループなら
		    		if(hCount == 3) {
		    			//末尾に:を追加
		    			sb.append(":");
		    			//xから3文字を表示
		    			System.out.print(sb);
		    			challenge = sc.nextLine();
			    		//入力とanswerを比較
			    		if(challenge.equals(answer)) {
			    			System.out.println("正解");
			    			mCount++;
			    		}else {
			    			System.out.println("miss!");
			    		}
		    			//StringBuilderを初期化
		    			sb.setLength(0);
		    		}
		    		
		    	}
		    	 
	    	}while(mCount < 2);
	    
		    	//終了時の時間を取得
		    	long end = System.currentTimeMillis();
		    	double time = (end - start)/1000.0;
		    	System.out.printf("%.1f秒かかりました",time);
		    	String word = "";
		    	if(time > 50.0) {
		    		word = "鈍すぎます";
		    	}else if(time > 40.0) {
		    		word = "少し鈍いですね";
		    	}else if(time > 34.0) {
		    		word = "まあまあですね";
		    	}else {
		    		word = "素早いですね";
		    	}
		    	System.out.println(word);
	}
}
