package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws IOException {
		
		//요구사항) 사용자로부터 태어난 년도를 입력 받아 나이를 출력하시오
		//입력: 연도입력:1995
		//출력: 1995년생은 올해 27세입니다.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("연도 입력:");
		String input1 = reader.readLine();
		int year = Integer.parseInt(input1);
		int num2 = 2021;
		int age = num2-year+1;
				
		System.out.printf("%d년생은 올해 %d살입니다.",year,age);
		
		 
	}

}
