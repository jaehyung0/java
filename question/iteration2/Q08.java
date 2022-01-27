package com.test.question.iteration2;

//김재형
public class Q08 {

	public static void main(String[] args) {
		
		for(int i=0;i<100;i+=10) {
			int sum=0;
			for(int j=1+i;j<=10+i;j++) {
				sum+=j;
			}System.out.printf("%d~%d: %d\n",i+1,10+i,sum);
		}
	}
}
