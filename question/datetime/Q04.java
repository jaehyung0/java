package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		
		
		event();
	}//main

	private static void event() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("남자이름:");
		String boyName = reader.readLine();
		
		System.out.print("여자이름:");
		String girlName = reader.readLine();
		
		System.out.print("만난날(년):");
		String s1 = reader.readLine();
		int year = Integer.parseInt(s1);
		
		System.out.print("만난날(월):");
		String s2 = reader.readLine();
		int month = Integer.parseInt(s2);
		
		System.out.print("만난날(일):");
		String s3 = reader.readLine();
		int date = Integer.parseInt(s3);
		
				
		System.out.printf("%s과(와) %s의 기념일\n",boyName,girlName);
		
		Calendar event = Calendar.getInstance();
		event.set(year, month-1, date);
		
		event.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n",event);
		
		event.add(Calendar.DATE, 100);
		System.out.printf("200일: %tF\n",event);
		
		event.add(Calendar.DATE, 100);
		System.out.printf("300일: %tF\n",event);
		
		event.add(Calendar.DATE, 200);
		System.out.printf("500일: %tF\n",event);
		
		event.add(Calendar.DATE, 500);
		System.out.printf("1000일: %tF\n",event);
		
		
	}
	
	
	
	
}



