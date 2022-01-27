package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws IOException {
		
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		//System.out.print("문장 입력: ");
		//String content = reader.readLine();

		//System.out.print("단어 입력: ");
		//String word = reader.readLine();

		String content = "안녕~  길동아~ 잘가~ 길동아";
		String word = "길동";
		int count = 0;
		
		
		for(int i=0;i<content.length()-1;i++) {
			if(content.substring(i,i+2).equals(word)) {
				count++;
			}
		}
		System.out.printf("%s을 총 %d회 발견했습니다.",word,count);
		System.out.println();
		
	//	int index = -1;
	//	count =0;
		
	//	while (true) {
	//		if (content.indexOf(word)>-1) {
	//			count++;
	//		}else 
	//			break;
	//		}
	
		int index = 0;
		count = 0;
		
		while (true) {
			
			index = content.indexOf(word,index); //index부터  word를 찾는다. word의 자리의 숫자가 index
			
			if (index >-1) {
				count++;
				index += word.length();				//index에 word길이만큼 더해주고 루프돌아가서 그 수다음부터 다시 index찾기
			} else {
				break;
			}
		}
			
		System.out.println("발견: " +count);
		
	}
}
