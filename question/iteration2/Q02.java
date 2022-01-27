package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//김재형
public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		System.out.print("행의 갯수를 입력하세요");
		num = Integer.parseInt(reader.readLine());
		
		for(int i=1;i<=num;i++) {
			for (int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}System.out.println();
			
		}
		
		
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
	}
}
