package com.test.question.iteration;



public class Q16 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int c = 0;
		int sum = 0;
		
		System.out.print(a+"+"+b);
	
		
		for(int i=1;i<10;i++) {
			
			c=a+b;
			
			System.out.print("+"+c);
			a=b;
			b=c;
			sum+=c; //출력값 누적
			
		}
		
		System.out.print("="+(sum+2));
		
	}
}
