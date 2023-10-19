package PrintGraph2;

import java.util.HashMap;
import java.util.Map;

public class PrintGraph2 {
	public static void main(String[] args) {
		int [] score={ 1, 62, 3, 4,65, 6, 7,68, 9,10, 
				41,42,43,44,55,56,57,58,69,60,
				21,22,23,24,25,36,37,38,39,30, 
				41,42,43,44,45,46,57,58,59,50,
				61,62,73,74,75,86,87,38,95,100}; 
		//得点 
		int cnt,i;
		int[] sum = {0,0,0,0,0};
		//各区分の人数集計 
		String[] kbn = {"区分A","区分B","区分C","区分D","区分E"};       
		//各区分名
		Map<String,Integer> map = new HashMap<>();
		
		//並べ替え
		for(int s = 0;s<score.length-1;s++) {
			for(int j = s+1;j>0;j--) {
				if(score[j]<score[j-1]) {
					int tmp = score[j];
					score[j] = score[j-1];
					score[j-1] = tmp;
				}
			}
		}
		
		//カウントリストを配列に格納する
		for(int j = 0;j<kbn.length;j++) {
			
		}
			
		
	}
}
