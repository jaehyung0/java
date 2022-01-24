package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) throws IOException {
		//자바 콘솔 프로그램 배포
		//1.컴파일 > Hello.class
		//2.1의 결과물 > 압축 >*.jar
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//이름 -> 인사하는 프로그램
		System.out.println("이름을 입력하세요:");
		String name = reader.readLine();
		System.out.printf("%s님 안녕하세요!\n",name);
	}
}
