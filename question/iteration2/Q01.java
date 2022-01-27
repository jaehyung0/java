package com.test.question.iteration2;

public class Q01 {

	public static void main(String[] args) {
		
		for (int i=5;i>0;i--) {
			
			for(int j=5;j>i;j--) {
			System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}

