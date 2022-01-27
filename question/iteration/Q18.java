package com.test.question.iteration;

public class Q18 {

	public static void main(String[] args) {
		
		
		
		for(int i=1;i<=100;i++) {
			int sum = 0;
			int j = 0;
			String result = "";
			
			for(j=1;j<i;j++) {
				if(i%j==0) {
					sum+=j;
					result+=j+" ";
					
				}
			}
			if (i==sum) {
				System.out.printf("%d [%s]\n",i,result);
			}
		}
		
	
	}
}
