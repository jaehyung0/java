package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Q07 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자: ");
		String num = reader.readLine();
		int index=0;
		String commanum = "";
		String newnum = "";
		String changenum = "";
		String result ="";
		
		for(int i=3;i<num.length();i+=3) {
			index = num.length()-i; 
			
			changenum = num.substring(index,index+1);
			System.out.println(changenum);
			commanum = ","+changenum;
			System.out.println(commanum);
			
			newnum = num.replace(changenum, commanum);
			System.out.println(newnum);
			result += newnum.substring(newnum.length()-i-1,newnum.length()-i+3);
			System.out.println(result);
		}
		
		System.out.printf("%s\n",result);
		
		
	}
}
