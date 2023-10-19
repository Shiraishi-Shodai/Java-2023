package HitAndBlow1;

import java.util.List;
import java.util.Random;

public class Tool {
	Random rand = new Random(); 
	
	public void add(int num,List<Integer> stack) {
	    while(num > 0){
            stack.add(0,num % 10);
            num = num / 10;
        }
	}

	public void chenge(List<Integer> quest) {
		for(int i = 0;i<quest.size();i++) {
			for(int j = 0;j<quest.size();j++) {
				if(i==j) {
					continue;
				}
				if(quest.get(i)==quest.get(j)) {
						quest.remove(i) ;
						quest.add(i,rand.nextInt(10));
						chenge(quest);
				}
			}
		}
	}
}
