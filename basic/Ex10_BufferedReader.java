package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex10_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		//요구사항) 숫자 2개를 입력 받아 두수의 합을 구하시오.
		
		//단축키 Ctrl + Shift + O
		
		//코드 조각 등록
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력:");
		String input1 = reader.readLine();
		
		System.out.print("숫자 입력:");
		String input2 = reader.readLine();
		
		System.out.print(input1+input2); // String+String 라서 붙여서 써진다
		//입력받은 String를 원하는 다른 자료형으로 변환해야한다.
		//유틸 클래스 사용
		//String->int,double,boolean
		System.out.println();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		System.out.printf("%d+%d=",num1,num2);
		System.out.println(num1+num2);
		//"100" -> 100 > Integer.parseInt()
		//"3.14"->3.14 > Double.parseDouble(), Float.parseFloat()
		//"true"->true > Boolean.parseboolean()
	}
}
