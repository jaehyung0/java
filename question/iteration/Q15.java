package com.test.question.iteration;

public class Q15 {

	public static void main(String[] args) {
	
		int n =1;
		int sum=0;
		String result = "";
		
		
		for(int i=0;i<14;i++) {
			n+=i;
			sum+=n;
			result += (i==0) ? n: "+"+n;
		}
		System.out.printf("%s=%d",result,sum);
	}
}
