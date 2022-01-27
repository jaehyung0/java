package com.test.question.iteration2;

public class Q07 {

	public static void main(String[] args) {
		
		
		for(int j=10;j<=100;j+=10) {
			int sum = 0;
			for(int i=1;i<=j;i++) {
				
				sum = sum+i;
				
				
			}System.out.printf("1~%d: %d\n",j,sum);
		}
			
		
	}
}
