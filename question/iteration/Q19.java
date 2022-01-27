package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q19 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 =0;
		int num2 =0;
		String str = "";
		
		System.out.print("첫번째 숫자:");
		num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자:");
		num2 = Integer.parseInt(reader.readLine());
		
		
		System.out.printf("%d의 약수:",num1);
		for(int i=num1;i<=num1;i++) {
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					str +=j;
					System.out.printf("%s,",j);
				}
			}
		}
		
		System.out.println();
		System.out.printf("%d의 약수:",num2);
		for(int i=num2;i<=num2;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					str +=j;
					System.out.printf("%s,",j);
				}
			}
		}
		
		System.out.println();
		System.out.printf("%d와 %d의 공약수:",num1,num2);
		
		if(num1>num2) {
			for(int i=1;i<=num1;i++) {
				if(num1%i==0&&num2%i==0) {
					str +=i;
					System.out.printf("%s,",i);
				}
			}
		}else {
			for(int i=1;i<=num2;i++) {
				if(num1%i==0&&num2%i==0) {
					str +=i;
					System.out.printf("%s,",i);
				}
			}
		}
		
		
	}
}
