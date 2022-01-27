package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q03 {

	public static void main(String[] args) throws IOException {
		
		
		birthandyear();
	}//main

	private static void birthandyear() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도:");
		String s = reader.readLine();
		
		int year = Integer.parseInt(s);
		
		Calendar now = Calendar.getInstance();
		
		now.add(Calendar.YEAR, -year+1);
		System.out.print("나이:" +now.get(Calendar.YEAR)+"세");
		
				
	}
}
