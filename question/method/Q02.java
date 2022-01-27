package com.test.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		
		String name = getName("이름:");
		System.out.printf("고객 : %s\n",name);
		
	}
	
	public static String getName(String msg) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(msg);
		String input = reader.readLine();
		input=input+"님";
		return input ;
		
	}
	
}
