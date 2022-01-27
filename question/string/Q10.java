package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("금액(원): ");
		String money = reader.readLine();
		for(int i=0;i<money.length();i++) {
		
			String ch = ""+money.charAt(i);
		
			switch(ch) {
				case "1" : ch = "일"; break;
				case "2" : ch = "이"; break;
				case "3" : ch = "삼"; break;
				case "4" : ch = "사"; break;
				case "5" : ch = "오"; break;
				case "6" : ch = "육"; break;
				case "7" : ch = "칠"; break;
				case "8" : ch = "팔"; break;
				case "9" : ch = "구"; break;
				case "0" : ch = ""; break;
			}
			System.out.println(ch);
			if(money.length()==1)
				System.out.println(ch+"원");
			if(money.length()==2)
				System.out.print(ch+"십"+ch+"원");
				
		}	
		
		
	}
}
