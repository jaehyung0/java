package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문장 입력: ");
		String sentence = reader.readLine();

		
		
		for(int i=1;i<=sentence.length();i++) {
			System.out.printf("%c",sentence.charAt(sentence.length()-i));
		}
	}
}
