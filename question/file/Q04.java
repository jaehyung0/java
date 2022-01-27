package com.test.question.file;

import java.io.File;

public class Q04 {
	
	public static void main(String[] args) {
		String path = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\음악 파일\\Music";
		
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
				
		for(int i=0;i<list.length;i++) {
			if(list[i].isFile() &&list[i].getName().toLowerCase().endsWith(".mp3"))
			{
				System.out.printf("[%03d]%s\n",i+1,list[i].getName());
			}
		}
			
	
	}

	
}
