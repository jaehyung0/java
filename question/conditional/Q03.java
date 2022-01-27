package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		nickName();
	}

	private static void nickName() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자:");
		String name = reader.readLine();
		
		if (name.equals("f") ||name.equals("F")) {
			System.out.println("Father");
		}else if(name.equals("m") ||name.equals("M")) {
			System.out.println("Mother");
		}else if(name.equals("s") ||name.equals("S")) {
			System.out.println("Sister");
		}else if(name.equals("b") ||name.equals("B")) {
			System.out.println("Brother");
		}
			
		
	}
	
}
