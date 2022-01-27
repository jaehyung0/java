package com.test.question.file2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q07 {

	public static void main(String[] args) throws Exception {
		
		String path = "D:\\class\\java\\파일_입출력_문제\\출결.dat";
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line = null;
		String txt = "";
		int late = 0;
		int early =0;
		while((line=reader.readLine())!=null) {
			
			String[] temp = line.split(",");
			
			if(Integer.parseInt(temp[2].substring(0,1))>=9) {
				late++;
			}else if(Integer.parseInt(temp[3].substring(0,2))>=18&&Integer.parseInt(temp[3].substring(temp[3].indexOf(":")))>0);{
				early++;
			}
			
		}
		System.out.println(late);
		System.out.println(early);
	}
}
