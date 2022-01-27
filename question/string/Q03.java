package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자: ");
		String num = reader.readLine();
		int sum =0;
		
		for(int i=0;i<num.length();i++) {
			char c = num.charAt(i);
			sum+=c-48;
			System.out.printf("+%c",c);
		}System.out.printf("=%d",sum);

	}
}
