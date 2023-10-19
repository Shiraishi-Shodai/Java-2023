package Chrctr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[]args) throws IOException{
		String word = "It is used mainly for storage sequential data, such as program libraries.";
		Scanner sc = new Scanner(System.in);
		String a = "";
		int count = 0;
		//アルファベットを生成しリストに格納する
		List<String> list = IntStream.rangeClosed('a', 'z').mapToObj(var -> (char)var ).map(var -> String.valueOf(var)).collect(Collectors.toList());
		Map<String,Integer> map = new HashMap<>();
		//int count[] = new int[alpha.length];
		BufferedWriter br = null;
		try {
				br = new BufferedWriter(new FileWriter("Chrctr-result.txt"));
				//一文字ずつwordを分割
				String [] box = word.split("");
				for(int i = 0;i<list.size();i++) {
					count = 0;
					//list.get(i)と等しいかを大小文字関係なく判断するためのパターンを生成
					Pattern p = Pattern.compile(list.get(i), Pattern.CASE_INSENSITIVE);
					for(int k = 0;k<box.length;k++){
						//pとbox[k]を比較するための準備
						Matcher m = p.matcher(box[k]);
						if(m.find()) {
							count++;
						}
					}
					//アルファベットlist.get(i)に対するカウントを追加
						map.put(list.get(i),count);
				}
				for(String key: map.keySet()) {
					//キーを小文字に変換して表示	
					System.out.printf("%s...%d  ",key,map.get(key));
					br.write(key+"..."+map.get(key)+"  ");
					//キーがg,n,uの時はかいぎょうする
					if(key.matches("[g|n|u]")) {
						System.out.println("");
						br.write("\n");
					}
				}
				br.flush();
		}catch(NumberFormatException e) {
			System.out.println("数値エラー");
		}catch(IOException e) {
			System.out.println("入出力エラー");
		}finally {
			br.close();
		}
		
	}
	
}
