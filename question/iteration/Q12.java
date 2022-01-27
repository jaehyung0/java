package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String number = "";
		for(int i=0;i<10;i++) {
			System.out.print("숫자:");
			int num = Integer.parseInt(reader.readLine());
			if(num<10) {
				switch(num) {
					case 1: number+="일"; break;
					case 2:	number+="이"; break;
					case 3: number+="삼"; break;
					case 4: number+="사"; break;
					case 5: number+="오"; break;
					case 6: number+="육"; break;
					case 7: number+="칠"; break;
					case 8: number+="팔"; break;
					case 9: number+="구"; break;
					
				}
			}else {
				System.out.print("종료");
				break;
			}
		}System.out.printf("결과: %s",number);
	}
}
