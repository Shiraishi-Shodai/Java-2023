package atcorder_goukeihosuu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        int[] array = new int[week];
        int arrayIndex = 0;
        
        for(int i = 0;i< week * 7; i++) {
        	
        	int day = sc.nextInt();
        	
        	array[arrayIndex] = array[arrayIndex] + day;
        	
        	if(i % 7 == 6) {
        		
        		arrayIndex++;
        		
        	}
        	
        }
        
        for(int i : array) {
        	System.out.println(i);
        }
        sc.close();
        
        
        
    }
}
