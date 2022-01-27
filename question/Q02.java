package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		
		//요구사항) 숫자 2개를 입력 받아 +연산과정과 결과를 모두 출력하시오.
		//입력) 첫번째 숫자: 5  두번쨰 숫자: 3
		//출력) 5+3=8
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자:");
		String input1 = reader.readLine();
		System.out.print("두번째 숫자:");
		String input2 = reader.readLine();
		int num1=Integer.parseInt(input1);
		int num2=Integer.parseInt(input2);
		int num3=num1+num2;
		System.out.printf("%,d+%,d=%,d",num1,num2,num3);
		
		
	}
}
