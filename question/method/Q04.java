package com.test.question.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n1,n2;
		int result;
		
		System.out.printf("첫번째 숫자:");
		String a = reader.readLine();
		
		System.out.printf("두번째 숫자:");
		String b = reader.readLine();
		
		n1 = Integer.parseInt(a);
		n2 = Integer.parseInt(b);
		
		result = add(n1,n2);
		result = add(n1,n1);
		result = subtract(n1,n2);
		result = multiply(n1,n2);
		result = multiply(n1,n1);
		result = divide(n1,n2);
		result = mod(n1,n2);
			
	
		
		
	} //main
	public static int add(int a, int b)  {
		System.out.printf("%d + %d = %d\n",a,b,a+b);
	return a+b;
	}//add
	
	public static int subtract(int a, int b) {
		System.out.printf("%d - %d = %d\n",a,b,a-b);
	return a-b;
	}//subtract
	
	public static int multiply(int a, int b) {
		System.out.printf("%d * %d = %d\n",a,b,a*b);
		return a*b;
	}//multiply
	
	public static int divide(int a, int b) {
		System.out.printf("%d / %d = %.1f\n",a,b,a/(double)b);
		return a/b;
	}//divide
	
	public static int mod(int a, int b) {
		System.out.printf("%d %% %d = %d\n",a,b,a%b);
		return a%b;
	}
}
