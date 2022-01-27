package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이메일: ");
		String email = reader.readLine();
		
		int index = email.indexOf("@");
		
		String id = email.substring(0,index);
		System.out.printf("아이디: %s\n",id);
		
		
		String domain = email.substring(index+1);
		System.out.printf("도메인: %s",domain);
		
		
		
	}
}
