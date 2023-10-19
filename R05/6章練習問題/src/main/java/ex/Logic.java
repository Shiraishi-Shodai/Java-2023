package ex;

import java.util.Random;

public class Logic {
	public int getNumber() {
		Random random = new Random();
		int num = random.nextInt(10);
		
		return num;
	}
}
