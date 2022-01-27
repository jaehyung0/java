package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("주민등록 번호: ");
		String jumin = reader.readLine();
		
		//'-' 제거
		jumin = jumin.replace("-","");
		
		int sum = 0;
		int remain = 0;
		
		for(int i=0; i<jumin.length()-1;i++) {
			//한자리 추출 -> 숫자
			//char c = jumin.charAt(i);
			//int num = (int)c-48;
			int n = Integer.parseInt(jumin.substring(i,i+1));
			sum += n*(i%8+2);
						
		}
		remain = sum%11;
		remain = 11-remain;
		remain%=10;
		System.out.println(remain);
		if(jumin.substring(12,13).equals(""+remain)){
			System.out.println("o");
		}else {
			System.out.println("x");
		}
		
	}
}
