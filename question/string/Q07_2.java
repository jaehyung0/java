package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("돈: ");
		String money = reader.readLine();
		
		int index = money.length()%3;
		String temp ="";
		
		money.substring(0,index);
		
				
		temp += money.substring(0,index);
		temp +=",";
		
		for(int i=index; i<money.length(); i+=3) {
			temp +=money.substring(i,i+3);
			temp +=",";
			System.out.println(temp);
		}
		
		temp = temp.substring(0,temp.length()-1);
		System.out.println(temp);
		
		
		//2번쨰 방법
		String temp2="";
		temp="";
		
		for (int i=money.length()-1;i>=0;i--) {
			temp += money.substring(i,i+1);
		}
		
		for(int i=0;i<temp.length()-3;i+=3) {
			temp2 += temp.substring(i,i+3)+",";
		}
		temp2 += temp.substring(temp.length() - temp.length()%3);
		
		System.out.println(temp2);
		
		String temp3 = "";
		for (int i=temp2.length()-1;i>=0;i--) {
			temp3 += temp2.substring(i,i+1);
			
		}
		System.out.println(temp3);
	}
}
