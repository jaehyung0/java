package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception{
		
		bigsmall();
	}//main

	private static void bigsmall() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자:");
		int num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자:");
		int num2 = Integer.parseInt(reader.readLine());
		
		if (num1>num2) {
			System.out.printf("큰수는 %d이고 작은수는 %d입니다.",num1,num2);
			System.out.printf("입력한 두 숫자의 차이는 %d가 납니다.",num1-num2);
		}else if(num1<num2) {
			System.out.printf("큰수는 %d이고 작은수는 %d입니다.",num2,num1);
			System.out.printf("입력한 두 숫자의 차이는 %d가 납니다.",num2-num1);
		}

	
	}
	
	
	
	
}
