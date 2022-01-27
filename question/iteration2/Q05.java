package com.test.question.iteration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		System.out.print("행의 갯수를 입력받으시오.");
		num = Integer.parseInt(reader.readLine());
		
		
		int r1 = 97;
		int r2 = 122;
		
		for(int i=1;i<=num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) { //왼쪽
				System.out.print((char)(r1+j));
			}
			for(int k=i;k>0;k--) { //오른쪽
				System.out.print((char)(r2-26+k));
			}System.out.println();
		}
	}
}
