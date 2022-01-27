package com.test.question.file2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q06 {

	public static void main(String[] args) throws Exception {
		
		String path = "D:\\class\\java\\파일_입출력_문제\\괄호.java";
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line = null;
		String txt = "";
		int small = 0;
		int midium = 0;
		
		while((line=reader.readLine())!=null) {
			String tt = line.replace("(", "1");
			small++;
			tt=tt.replace(")","1");
			small++;
			tt=tt.replace("{", "2");
			midium++;
			tt=tt.replace("}", "2");
			midium++;
			txt+=tt+"\r\n";
		}
		
		reader.close();
		System.out.println(small);
		System.out.println(midium);
		if(midium%2==0&&small%2==0) {
			System.out.println("올바른 소스 입니다.");
		}else {
			System.out.println("올바르지 않은 소스입니다.");
		}
	}
}
