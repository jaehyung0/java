package com.test.question.file;

import java.io.File;

public class Q06 {

	public static void main(String[] args) {
		
		String path = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\파일 제거";
		
		File file = new File(path);
		
		File[] list = file.listFiles();
		
		for(File files : list) {
			if(files.length()==0) {
				files.delete();
			}
		}
	}
}
