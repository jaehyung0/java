package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//김재형
public class Q06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=10;i++) {
			System.out.printf("+%d",i);
			sum1+=i;
			i++;
			System.out.printf("-%d",i);
			sum2+=i;
		}System.out.printf("=%d",sum1-sum2);
		System.out.println();
		
		
		type();//입력값 있음
	}//main

	private static void type() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int start = 0;
		int end = 0;
		
		System.out.print("시작 숫자:");
		start = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자:");
		end = Integer.parseInt(reader.readLine());
		
		int sum=0;
		
		for(int i=start;i<=end;i++) {
			if(i%2==1) {
				sum+=i;
				System.out.printf("+%d",i);
			}else {
				sum-=i;
				System.out.printf("-%d",i);
			}
		}System.out.printf("=%d",sum);
	}
	
	
}
