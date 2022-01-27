package com.test.question.method;						
						
import java.io.BufferedReader;						
import java.io.IOException;						
import java.io.InputStreamReader;						
						
					
public class Q05 {						
						
	public static void main(String[] args) throws IOException {					
						
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n1;
		String result;
		
		System.out.print("숫자:");
		String num = reader.readLine();
		n1 = Integer.parseInt(num);
		
		result = getNumber(n1);
		
		System.out.printf("입력하신 숫자 '%d'는 '%s'입니다.",n1,result);
	}//main					
	
	public static String getNumber(int num) {
		return num%2==0 ? "짝수" : "홀수";
	}
	
	
}						
