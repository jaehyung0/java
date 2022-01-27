package com.test.question.file;

import java.io.File;

public class Q05 {

	public static void main(String[] args) {
		
		String path = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\확장자별 카운트";
		
		File file = new File(path);
		
		int gif=0;
		int jpg=0;
		int png=0;
		
		File[] list = file.listFiles();
		System.out.println(list.length);
		for(int i=0;i<list.length;i++) {
			//System.out.println(list[i].getName());
			int index = list[i].getName().lastIndexOf(".");
			if(list[i].getName().substring(index+1).equals("gif")) {
				gif++;
				
			}else if(list[i].getName().substring(index+1).equals("jpg")) {
				jpg++;
				
			}else if(list[i].getName().substring(index+1).equals("png")) {
				png++;
				
			}
		}
		System.out.printf("*.gif:%d개\n",gif);
		System.out.printf("*.jpg:%d개\n",jpg);
		System.out.printf("*.png:%d개\n",png);
	}
}
