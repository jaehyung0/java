package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q05 {

	public static void main(String[] args) throws IOException{
		
		yearMinus();
	}

	private static void yearMinus() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아빠 생일(년):");
		String s1 = reader.readLine();
		int dadyear = Integer.parseInt(s1);
				
		System.out.print("아빠 생일(월):");
		String s2 = reader.readLine();
		int dadmonth = Integer.parseInt(s2);
		
		System.out.print("아빠 생일(일):");
		String s3 = reader.readLine();
		int daddate = Integer.parseInt(s3);
		
		System.out.print("딸 생일(년):");
		String s4 = reader.readLine();
		int daugyear = Integer.parseInt(s4);
				
		System.out.print("딸 생일(월):");
		String s5 = reader.readLine();
		int daugmonth = Integer.parseInt(s5);
		
		System.out.print("딸 생일(일):");
		String s6 = reader.readLine();
		int daugdate = Integer.parseInt(s6);
		
		Calendar dad = Calendar.getInstance();
		Calendar daug = Calendar.getInstance();
		
		dad.set(dadyear, dadmonth, daddate);
		long dadTick = dad.getTimeInMillis();
		
		daug.set(daugyear, daugmonth, daugdate);
		long daugTick = daug.getTimeInMillis();
		
		long subtract = (daugTick-dadTick)/1000/3600/24;
				
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.",subtract);	
	}
}

