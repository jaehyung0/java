package com.test.question.file;

import java.io.File;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		//Scanner scan = new Scanner(System.in);
		//System.out.print("주소입력:");
		//String input=scan.nextLine();
		//String path = "E:\\class\\JavaTest\\file\\aaa\\data.txt";
		String path = "E:\\class\\JavaTest\\file\\aaa\\data.txt";
		
		File file = new File(path);
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.isFile());
		
		System.out.println("파일명:"+file.getName());
		
		int index = file.getName().lastIndexOf(".");
		System.out.println("종류:"+file.getName().substring(index)+"파일");
		
		System.out.println("파일크기:"+file.length());
		
	}
}
