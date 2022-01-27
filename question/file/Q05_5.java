package com.test.question.file;

import java.io.File;
import java.util.HashMap;

public class Q05_5 {

	public static void main(String[] args) {
		
		String path = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\확장자별 카운트";
		
		File file = new File(path);
		
		File[] list = file.listFiles();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int c=0;
		for(int i=0;i<list.length;i++) {
			int d=1;
			int index = list[i].getName().lastIndexOf(".");
			String ext = list[i].getName().substring(index+1);
			map.put(ext, d++);
			
			System.out.printf("%s: %d\n",map.get(d),map.get(ext));
			System.out.println(map.toString());
		}
	}
}
