package com.test.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("숫자 입력:");
		String n = reader.readLine();
		int num = Integer.parseInt(n);
		digit(num);
		
		
	}//main
	
	public static void digit(int num) {
		
		System.out.printf("%d -> %04d",num,num);
					
	}
	
	
}
