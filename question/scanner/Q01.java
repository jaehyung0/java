package com.test.question.scanner;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int plus=0;
		int minus=0;
		int zero=0;
		int i=0;
		
		System.out.print("정수 입력:");
		String input=scan.nextLine();
		
		String temp[] = input.split(" ");
		String[] numbox = new String[temp.length+1];
		
		for(i=0;i<temp.length;i++) {
			
		
			if(temp[i].substring(0,1).equals("-"))
				minus++;
			else if(temp[i].equals("0"))
				zero++;
			else
				plus++;
			numbox[i]=temp[i];
					
		}
		
		System.out.println("[결과]");
		System.out.printf("양수: %d개\n",plus);
		System.out.printf("음수: %d개\n",minus);
		System.out.printf("0: %d개\n",zero);
		if(temp.length>=6) {
			System.out.printf("숫자가 %d개 많습니다.",temp.length-5);
		}
		else if(numbox[i]==(null))
			System.out.printf("숫자가 %d개 부족합니다.",5-i);
		
		
	}
}
