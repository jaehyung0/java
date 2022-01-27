package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("금액(원): ");
		String money = reader.readLine();
		
		String temp="";
		//자릿수마다 단위 지정
		
		for(int i=money.length()-1;i>=0;i--) {
			String s = money.substring(i,i+1);
			if(i==money.length()-1) {  //1의자리
				temp = getNumber(s)+"원" + temp;
			}else if(i==money.length()-2)
				temp = getNumber(s)+"십" + temp;
			else if(i==money.length()-3)
				temp = getNumber(s)+"백" + temp;
			else if(i==money.length()-4)
				temp = getNumber(s)+"천" + temp;
			else if(i==money.length()-5)
				temp = getNumber(s)+"만" + temp;
		}
		
		System.out.println("일금:"+ temp);
		
	}

	private static String getNumber(String s) {
		
		if(s.equals("1"))
			return "일";
		else if(s.equals("2"))
			return "이";
		else if(s.equals("3"))
			return "삼";
		else if(s.equals("4"))
			return "사";
		else if(s.equals("5"))
			return "오";
		else if(s.equals("6"))
			return "육";
		else if(s.equals("7"))
			return "칠";
		else if(s.equals("8"))
			return "팔";
		else if(s.equals("9"))
			return "구";
		else
			return "";
	}
}
