package com.test.question.iteration;

public class Q07 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;;i++) {
			System.out.printf("%d+",i);
			sum+=i;
			
			if(sum>1000) {
				break;
			}
			}System.out.printf("=%d",sum);
	}
}
