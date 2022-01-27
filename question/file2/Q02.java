package com.test.question.file2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Q02 {

	public static void main(String[] args) throws Exception {
		
		String path = "D:\\class\\java\\파일_입출력_문제\\숫자.dat";
		
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		File file = new File(path);
		System.out.println(file.exists());
		
		String line;
		String txt="";

		
		
		while((line=reader.readLine())!=null) {
			String tt = line.replace("0","공");
			tt=tt.replace("1", "일");
			tt=tt.replace("2", "이");
			tt=tt.replace("3", "삼");
			tt=tt.replace("4", "사");
			tt=tt.replace("5", "오");
			tt=tt.replace("6", "육");
			tt=tt.replace("7", "칠");
			tt=tt.replace("8", "팔");
			tt=tt.replace("9", "구");
			
			txt+=tt+"\r\n";
			System.out.println(txt);
			
		}
		
		reader.close();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\class\\java\\파일_입출력_문제\\숫자_변환.dat"));
		writer.write(txt);
		writer.close();
		System.out.println("변환 후 다른 이름으로 저장했습니다.");
	}
}
