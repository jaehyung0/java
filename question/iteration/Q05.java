package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int start =0;
		int end=0;
		
		System.out.print("시작 숫자:");
		start = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자:");
		end = Integer.parseInt(reader.readLine());
		
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
			System.out.printf("%d+",i);
			
			
		}System.out.printf("=%d",sum);
	}
	
	
	
	
	
}
