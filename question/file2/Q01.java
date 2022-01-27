package com.test.question.file2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;



public class Q01 {

	public static void main(String[] args) throws Exception {
		String path = "D:\\class\\java\\파일_입출력_문제\\이름수정.dat";
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line =null;
		String txt="";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("바뀔 단어를 입력하세요.");
//		String input = scan.nextLine();
		
		String str = "유재석바보 유재석호호 유재석하핳 유재석히히";
		String txtt = str.replace("유재석", "메뚜기");
		txtt = txtt.replace("호호", "키키");
		System.out.println(txtt);
		
		
		while((line=reader.readLine())!=null) {
			String tt = line.replace("유재석", "메뚜기");
			System.out.println(tt);
			txt+=tt+"\r\n";
			
		}
		
		reader.close();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\class\\java\\파일_입출력_문제\\이름수정_변환.dat"));
		writer.write(txt);
		writer.close();
		System.out.println("변환 후 다른 이름으로 저장했습니다.");
	}
}
