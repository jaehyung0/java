package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		oddeven();
	}

	private static void oddeven() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int odd=0;
		int even=0;
		
		for(int i=0;i<10;i++) {
			System.out.print("숫자:");
			int num = Integer.parseInt(reader.readLine());
			if(num%2==0)even+=num;
			else odd+=num;
		}
		System.out.printf("짝수의 합:%,d\n",even);
		System.out.printf("홀수의 합:%,d",odd);
		
	}
}
