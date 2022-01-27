package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		leapYear();
	}

	private static void leapYear() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력:");
		int year = Integer.parseInt(reader.readLine());
		
		String result = "";
		
		if(year%4!=0) {
			result = "평년";
		}else if(year%100!=0) {
			result = "윤년";
		}else if(year%400==0) {
			result = "윤년";
		}else {
			result = "평년";
		} System.out.printf("%d년은 '%s'입니다.\n",year,result);
	} 
}

