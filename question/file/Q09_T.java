package com.test.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q09_T {

	public static void main(String[] args) {
		
		String path ="E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\크기 정렬";
		File file = new File(path);
		ArrayList<File> list = new ArrayList<File>();
		
		
		if(file.exists()) {
			addFiles(file,list);
		}
		
		for(int i=0; i<list.size()-1;i++) {
			for(int j=0;j<list.size()-1-i;j++) {
				if(list.get(j).length()>list.get(j+1).length()) {
					File temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		
		for(File filess : list) {
			System.out.printf("%s - %d\r\n",filess.getName(),filess.length());
		}
		
		
	}

	private static void addFiles(File file, ArrayList<File> list) {
		File[] sublist =file.listFiles();
		
		for(File files : sublist) {
			if(files.isFile()) {
				list.add(file);
				
			}
		}
		
		
		for(File sub : list) {
			if(sub.isDirectory()) {
				addFiles(sub,list);
			}
		}
		
	}
}
