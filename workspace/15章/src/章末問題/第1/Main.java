package 章末問題.第1;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<=100;i++) {
			if(i==100) {
				sb.append(i);
			}else {
				sb.append(i+",");
			}
			
		}
		String s = sb.toString();
		String []a = s.split(",");
		System.out.println(s);
	}
}
