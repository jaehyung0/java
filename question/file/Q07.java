package com.test.question.file;

import java.io.File;

public class Q07 {

	public static void main(String[] args) {
		
		String MusicA = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\동일 파일\\MusicA";
		String MusicB = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\동일 파일\\MusicB";
		
		File fileA = new File(MusicA);
		File fileB = new File(MusicB);
		
		File[] listA = fileA.listFiles();
		File[] listB = fileB.listFiles();
		
		String temp="";
				
		for(int i=0;i<listA.length;i++) {
			for(int j=0;j<listB.length;j++) {
				if(listA[i].getName().equals(listB[j].getName())) {
					temp+=listA[i].getName()+"\n";
				}
			}
		}
		System.out.println(temp);
	}
}
