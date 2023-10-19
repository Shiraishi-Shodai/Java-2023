package PrintGraph2;

public class Tool {
	
	//バブルソート
//	List<Integer> list = new ArrayList<>();
//	public void sort(int[] score) {
//		int [] score1 = new int[score.length/2];
//		int [] score2 = new int[score.length-score1.length];		
//		int n = 0;
//		int m = 0;
//		
//		while(score.length>1) {
//			for(int i = 0;i<score1.length;i++) {
//				score1[i] = score[i];
//			}
//			for(int i = 0;i<score2.length;i++) {
//				score2[i] = score[score1.length+i];
//			}
//			
//			sort(score1);
//			sort(score2);
//			marge(score1,score2,score);
//		}
//	}
//	
//	public void marge(int[] score1,int[] score2,int[]score) {
//		int i = 0;
//		int j = 0;
//		
//		while(i<score1.length && j<score2.length) {
//			if(score1[i]<score2[j]) {
//				score[i+j] = score1[i];
//				i++;
//			}else {
//				score[i+j] = score2[j];
//				j++;
//			}
//		}
//		while(i<score1.length || j<score2.length) {
//			if(i<score1.length) {
//				score[i+j] = score1[i];
//				i++;
//			}else {
//				score[i+j] = score2[j];
//				j++;
//			}
//		}
//	
//	}
}
