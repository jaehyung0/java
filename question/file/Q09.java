package com.test.question.file;

import java.io.File;
import java.util.Arrays;





public abstract class Q09 implements Comparable<Q09>{

	public static void main(String[] args) {
		
		String path = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\크기 정렬";
		File file = new File(path);
		
		openFiles(file);
		Object[] list = null;
		
	
	}
	private static void openFiles(File file) {
		
		File[] list = file.listFiles();
		
		
		for(int i=0;i<list.length;i++) {
			
			
			int index = list[i].getParent().lastIndexOf("\\");
			System.out.printf("%s \t\t %.1fKB %s\n",list[i].getName(),(double)list[i].length()/1024,list[i].getParent().substring(index+1));
			
	
		}
		
		
		for(File dir : list) {
			if(dir.isDirectory()) {
				openFiles(dir);
			}
		}
		
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length-i-1;j++) {
				if(list[j].length()>list[j+1].length()) {
					File temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			
				
			}
			int index = list[i].getParent().lastIndexOf("\\");
			System.out.printf("%s \t\t %.1fKB %s\n",list[i].getName(),(double)list[i].length()/1024,list[i].getParent().substring(index+1));
		}
		
		
	}

}





