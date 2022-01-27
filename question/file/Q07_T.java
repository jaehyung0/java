package com.test.question.file;

import java.io.File;

public class Q07_T {
	public static void main(String[] args) {
		q07();
	}

	private static void q07() {
		String MusicA = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\동일 파일\\MusicA";
		String MusicB = "E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\동일 파일\\MusicB";
		
		File fileA = new File(MusicA);
		File fileB = new File(MusicB);
		
		File[] listA = fileA.listFiles();
		File[] listB = fileB.listFiles();
		
		int count=0;
		for(File fa : listA) {
			boolean flag = false;
			
			for(File fb :listB) {
				if(fa.getName().equals(fb.getName())) {
//					System.out.println(fa.getName());
//					count++;
					flag=true;
					break;
				}
			}
			
//			if(flag=false) {
//				System.out.println(fa.getName());
//			}
		}
		System.out.println(count);
	}
}
