package com.test.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
	int kor,eng,math;
	String result;
	
	System.out.print("국어:");
	String a = reader.readLine();
	
	System.out.print("영어:");
	String b = reader.readLine();
	
	System.out.print("수학:");
	String c = reader.readLine();
	
	kor = Integer.parseInt(a);
	eng = Integer.parseInt(b);
	math = Integer.parseInt(c);
	
	result = test(kor,eng,math);
	System.out.printf("%s",result);
	
	
	
		
	}//main
	public static String test(int kor, int eng, int math) {
		return kor>=40 && eng>=40 && math>=40 && (kor+eng+math)/3>=60 ? "합격" : "불합격";
	}
	
	
	
}
