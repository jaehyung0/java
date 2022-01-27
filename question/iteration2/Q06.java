package com.test.question.iteration2;

public class Q06 {

	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			for(int k=2;k<=5;k++) {
				System.out.printf("%d x %d = %2d ",k,i,i*k);
				
			}System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			for(int k=6;k<=9;k++) {
				System.out.printf("%d x %d = %2d ",k,i,i*k);
				
			}System.out.println();
		}
	}
}
