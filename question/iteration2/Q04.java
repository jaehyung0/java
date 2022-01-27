package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		System.out.print("행의 갯수를 입력하시오:");
		num = Integer.parseInt(reader.readLine());
		
		for(int i=0;i<num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=i;j++) {   //여기 for문 필요가 없음.
				System.out.print("*");
			}System.out.println();
		}
	}		
		
}
	
