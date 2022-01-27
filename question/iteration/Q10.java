package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum=0;
		int num=0;
		int end=0;
		String result ="";
		
		System.out.print("누적 몇을 넘어가면 종료할까요?");
		end = Integer.parseInt(reader.readLine());
		
		for(int i=0;;i++) {
			
			System.out.print("숫자:");
			num = Integer.parseInt(reader.readLine());
			if(num%2==0) {
				sum+=num;
				result += (i==0) ? num: "+"+num;
				
			} 
			else {
				sum-=num;
				
				result += (i==0) ? num: "-"+num;
			}
			if(sum>=end) {
				
				break;
			}
		}
		
		System.out.printf("%s=%d",result,sum);
	}
}
