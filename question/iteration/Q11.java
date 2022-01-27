package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int max =0;
		
		System.out.print("최대숫자:");
		max = Integer.parseInt(reader.readLine());
		
		for(int i=1;i<=max;i++) {
			if(i/10==3||i/10==6||i/10==9) {
				System.out.print("짝짝 ");
			}else if(i/100==3||i/100==6||i/100==9) {
				System.out.print("짝짝 ");
			}else if(i%10==3||i%10==6||i%10==9) {
				System.out.print("짝 ");
			}else {
				System.out.print(i+" " );
			}
				
		}
	
	}
}
