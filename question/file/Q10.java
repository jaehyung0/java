package com.test.question.file;

import java.io.File;

public class Q10 {

	public static void main(String[] args) {
		
		String path ="E:\\class\\JavaTest\\file\\파일_디렉토리_문제\\직원";

		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				
				
				
				String[] temp = getToken(file.getName());
				
				
				
				File subdir = new File(MyPath.Q010 + "\\" + temp[0] + "\\" + temp[1]);
				
				subdir.mkdirs(); 
				
				
				file.renameTo(new File(subdir.getAbsolutePath() + "\\" + file.getName()));		
				
				System.out.println("완료");
				
			}
		}
		
		
	}

	private static String[] getToken(String name) {
		
		//아무게_2014__17.txt
//		String[] temp = new String[2];
		
//		int index = name.indexOf("_");
//		temp[0] = name.substring(0, index); //직원명
//		
//		int index2 = name.indexOf("_", index + 1);
//		temp[1] = name.substring(index + 1, index2); //년도
		
		String[] temp2 = name.split("_");
		
		return temp2;		
	}
		
		
	

	
	
	

	
}

