package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		System.out.print("행의 갯수를 입력받으시오.");
		num = Integer.parseInt(reader.readLine());
		
		for(int i=1;i<=num;i++) {
			for (int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<i;j++) {
				System.out.print("*");// 2번이랑 똑같음
			}
			for(int k=1;k<i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
