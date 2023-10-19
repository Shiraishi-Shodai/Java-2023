package stack;
import static java.lang.System.*;
public class auto {
	
	public void damp(int[] stack,int count) {
		for(int i = stack.length-1;i>=0;i--) {
			if(i<count) {
				out.println("["+i+"]"+stack[i]);
			}else {
				out.println("["+i+"]");
			}
			
		}
	}
	public String peak(int[] stack,int count) {
		int peak = stack[0];
		for(int i = 0;i<count;i++) {
			if(peak<stack[i]) {
				peak = stack[i];
			}
		}
		return "ピークデータは"+peak+"です。";
	}
	public void pop(int[] stack,int count) {
		//stackメソッドの最後尾にある値を文字列に変換
		String sta = String.valueOf(stack[count-1]);
		out.println("データ"+sta+"をポップしました");
		sta = null;
		
	}
			
}
