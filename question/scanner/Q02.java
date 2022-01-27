package com.test.question.scanner;

import java.util.Scanner;



public class Q02 {
	
	public static int num, word, mix;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
//		int num=0;
//		int word=0;
//		int mix=0;
		
		System.out.print("입력:");
		String input = scan.nextLine();
		String temp[] = input.split(" ");
		
		for(int i=0;i<temp.length;i++) {
			
			boolean numFlag=false;
			boolean wordFlag=false;
			for(int j=0;j<temp[i].length();j++) {
				
				char c = temp[i].charAt(j);
				if(c>='0'&&c<='9') 
					numFlag=true;
					
				else
					wordFlag=true;
			
			}
			if(numFlag&&wordFlag) mix++;
			else if(numFlag&&!wordFlag) num++;
			else if(!numFlag&&wordFlag) word++;
		
		}
		System.out.println("[결과]");
		System.out.printf("숫자: %d",num);
		System.out.printf("문자: %d",word);
		System.out.printf("혼합: %d",mix);		
			
	}
		
}		
