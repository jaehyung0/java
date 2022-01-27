package com.test.question.file;

import java.io.File;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
			
		Scanner scan = new Scanner(System.in);
		System.out.print("폴더 선택:");
		String path = scan.nextLine();
		System.out.print("파일확장자:");
		String back = scan.nextLine();
		
		File file = new File(path);
		
		File[] list = file.listFiles();
		//System.out.println(list);
		//int index = list[1].getName().lastIndexOf(".");
		//System.out.println(index);
		//System.out.println(list[1].getName().substring(index));
//		for(int i=0;i<list.length;i++) {
//			index = list[i].getName().lastIndexOf(".");
//			if(back.equals(list[i].getName().substring(index+1))) {
//				System.out.printf("[%s]\r\n",list[i].getName());
//			}
//		}
		
		for(File subfile : list) {
			int index = subfile.getName().lastIndexOf(".");
			if(back.equals(subfile.getName().substring(index+1))) //파일이면
				System.out.printf("[%s]\r\n",subfile.getName());
		}
	}
}
