package 席替え;
import static java.lang.System.*;
public class Shuffle {
	public static void main(String[] args) {
		
        int ran[] = new int[3];
        for(int i = 0;i<ran.length;i++) {
        	do {
        ran[i] = new java.util.Random().nextInt(48)+1;
        	}while(ran[i]==17);
        }
        out.println("司会"+ran[0]+"番");
        out.println("書記"+ran[1]+"番");
        out.println("ホワイトボード"+ran[2]+"番");
	}
}
