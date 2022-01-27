package com.test.question.file;

import java.io.File;

public class Q08 {
	
	private static int count=0;
	private static int dcount=0;
	
	public static void main(String[] args) {
		
		String path ="E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\폴더 삭제\\delete";
		
		File file = new File(path);
		
		if(file.exists()) {
			countFiles(file);
		}
		file.delete();
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개 입니다.",dcount,count);
	}

	private static void countFiles(File file) {
		File[] list =file.listFiles();
		
		for(File subfile : list) {
			if(subfile.isFile()) {
				subfile.delete();
				count++;
			
			}
		}
		
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				dcount++;
				countFiles(subdir);
			}
		}
		
		
		
	}
}
