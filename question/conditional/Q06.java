package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		letterPrint();
	}

	private static void letterPrint() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자:");
		char letter = (char) reader.read(); //A~Z > 65~90   a~z > 97~122
		int n1 = (int) letter;
		
		if(n1>=65 && n1<=90) {
			System.out.printf("결과:%c",(char)(n1+32));
		}else if(n1>=97 && n1<=122) {
			System.out.printf("결과:%c",(char)(n1-32));
		}
		
	}
}
