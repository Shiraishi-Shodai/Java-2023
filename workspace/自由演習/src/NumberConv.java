import java.util.Scanner;
public class NumberConv {
	static Scanner sc = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("縦に何個表示しますか");
		int vertical = sc.nextInt();
		System.out.print("横に何個表示しまうか");
		int beside = sc.nextInt();
		int count =0;
		for(int i = 1;i<=vertical;i++) {
			for(int b = 1;b<=beside;b++) {
				if(count==0||count%3==0) {
					System.out.print("●");
					count++;
				}else {
					System.out.print("○");
					count++;
				}
					
			}
			count++;
			System.out.println("");
		}
		
		
	}
	
}
