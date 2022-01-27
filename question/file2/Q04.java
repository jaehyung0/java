package com.test.question.file2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) throws Exception {
		
		String path = "D:\\class\\java\\파일_입출력_문제\\단일검색.dat";
		File file = new File(path);
		if(file.exists()) {
			System.out.println("파일존재");
		}else
			System.out.println("파일없음");
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line = null;
		String txt="";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scan.nextLine();
			
		
		
		while((line=reader.readLine())!=null) {
			String[] temp = line.split(",");
			if(temp[1].equals(name)) {
				System.out.printf("[%s]\n",temp[1]);
				System.out.printf("번호:%s\n",temp[0]);
				System.out.printf("주소:%s\n",temp[2]);
				System.out.printf("전화:%s",temp[3]);
			}
				
		}
		
		reader.close();
	}
}
