package ファイル読み込み;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
	public static void main(String[] args) {
		FileReader fileReader = null;
        //配列の用意
        char[] b = new char[48];
        int count = 0;
        try {
            // 1.ファイルのパスを指定する
            File file = new File("c:/クラス.txt");
         
            // 2.ファイルが存在しない場合に例外が発生するので確認する
            if (!file.exists()) {
                System.out.print("ファイルが存在しません");
                return;
            }
         
            // 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
            fileReader = new FileReader(file);
            int data;
 
            while ((data = fileReader.read()) != -1) {
            	 b[count] = (char)data;
            	 System.out.print(b[count]);
            	 count++;
            }         
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
        	if(fileReader!=null) {
        		try {
        	          // 4.最後にファイルを閉じてリソースを開放する
                    fileReader.close();
        		}catch(IOException e) {
        			;
        		}
        	}
        }
        
	}
}
