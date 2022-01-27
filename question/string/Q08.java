package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q08 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String result = "";
		char ch =' ';
		System.out.print("단어: ");
		String words = reader.readLine();

		for(int i=0;i<words.length();i++) {
			ch = words.charAt(i);
			if(ch>'A'&&ch<'Z'&&i!=0) {
				result +=" "+ch;
			}else {
				result +=ch;
			}
		}
		System.out.printf("결과: %s",result);
	}
}
