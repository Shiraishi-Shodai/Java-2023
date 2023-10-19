package 第７章.章末問題;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Practice {
	public static void main (String[]args) throws IOException {
		Employee employee = new Employee("田中太郎",41);
		Department de = new Department("総務部",employee);
		FileOutputStream fos = new FileOutputStream("company.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(de);
		oos.flush();
		oos.close();
		
//		FileInputStream fis = new FileInputStream("company.dat");
//		ObjectInputStream ois = new ObjectInputStream(fis);
		
	}
}
