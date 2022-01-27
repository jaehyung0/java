package com.test.question.file;

import java.io.File;

public class Q08_T {

	public static void main(String[] args) {
		
		String path ="E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\폴더 삭제\\delete";
		File file = new File(path);
		
		delete(file);
		
	}

	private static void delete(File file) {
		File[] list =file.listFiles();
		
		for(File files : list) {
			if(files.isFile()) {
				files.delete();
				
			}
		}
		
		for(File sub : list) {
			if(sub.isDirectory()) {
				delete(sub);
			}
		}
		
	}
}
