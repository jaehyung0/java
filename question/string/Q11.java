package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문장입력: ");
		String content = reader.readLine();

		int sum = 0;
		int num = 0;
		char ch = ' ';
		
		for(int i=0; i<content.length(); i++) {
			ch = content.charAt(i);
			if(ch > '0' && ch <= '9') {
				num = Integer.parseInt(""+ch);
				sum += num;
			}
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
	}
}
