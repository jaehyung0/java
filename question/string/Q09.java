package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		
		System.out.print("문장: ");
		String content = reader.readLine();

		String word1 = "바보";
		String word2 = "멍청";
		
		if(content.indexOf(word1)!=-1) {
			num++;
			content = content.replace(word1, "**");
			
		}
		if(content.indexOf(word2)!=-1) {
			num++;
			content = content.replace(word2, "**");
		}
		System.out.println(content);
		System.out.printf("금지어를 %d회 마스킹했습니다.",num);
		//2번까지밖에 마스킹이 안됨
	}
}
