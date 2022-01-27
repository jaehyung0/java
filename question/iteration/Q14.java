package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		long num = 0;
		
		int evensum = 0;
		int oddsum = 0;
		
	
		System.out.print("9자리 숫자 입력:");
		num = Long.parseLong(reader.readLine());
		
		if(num<1000000000) {
		
			for(int i=0;i<9;i++) {
				long remain = num%10;
				num/=10;
			
					if(remain%2==0) {
						evensum+=remain;
				
					}else {
						oddsum+=remain;
							}
			}	System.out.printf("짝수의 합: %d\n",evensum);
				System.out.printf("홀수의 합: %d",oddsum);
		
		}	else {
			System.out.println("9자리 숫자를 입력하세요.");
			}
		
	}
}
