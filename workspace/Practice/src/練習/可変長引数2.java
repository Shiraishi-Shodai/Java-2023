package 練習;

public class 可変長引数2 {
	public void setNumber(int... a) {
		int max = a[0];
		for(int i = 0;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		System.out.println("max:"+max);
	}
	

}
