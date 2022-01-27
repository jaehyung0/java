package com.test.question.file2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Q03 {

	public static void main(String[] args) throws Exception {
		
		String path ="D:\\class\\java\\파일_입출력_문제\\성적.dat";
		File file = new File(path);
		if(file.exists()) {
			System.out.println("파일존재");
		}else
			System.out.println("파일없음");
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line =null;
		String pass="";
		String fail="";
		int n=0;
		while((line=reader.readLine())!=null) {
			String[] temp = line.split(",");
			
			if(average(temp[1],temp[2],temp[3])>60&&!failed(temp[1],temp[2],temp[3])) {
				pass+=line+"\r\n";
			}else {
				fail+=line+"\r\n";
			}
		}
		
		reader.close();
		System.out.println("[합격자]");
		System.out.println(pass);
		System.out.println("[불합격자]");
		System.out.println(fail);
		
	}

	private static boolean failed(String score1, String score2, String score3) {
		int kor = Integer.parseInt(score1);
		int eng= Integer.parseInt(score2);
		int math = Integer.parseInt(score3);
		
		if(kor<40||eng<40||math<40) {
			return true;
		}else
			return false;
		
	}

	private static int average(String score1, String score2, String score3) {
		int kor = Integer.parseInt(score1);
		int eng= Integer.parseInt(score2);
		int math = Integer.parseInt(score3);
		
		int averageScore = (kor+eng+math)/3;
		return averageScore;
		
	}
}
