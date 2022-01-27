package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		sum();
	}

	private static void sum() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자:");
		int num = Integer.parseInt(reader.readLine());
		
		int sum =0;
		for (int i=1;i<=num;i++) {
			sum+=i;
		}System.out.printf("1~%d=%d",num,sum);
	}
}
