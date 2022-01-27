package com.test.question.conditional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		
		calculator();
	}

	private static void calculator() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자:");
		int num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자:");
		int num2 = Integer.parseInt(reader.readLine());
		
		System.out.print("연산자:");
		String operator = reader.readLine();
		
		if(operator.equals("+")) {
			System.out.printf("%d + %d = %d",num1,num2,num1+num2);
		}else if(operator.equals("-")) {
			System.out.printf("%d - %d = %d",num1,num2,num1-num2);
		}else if(operator.equals("*")) {
			System.out.printf("%d * %d = %d",num1,num2,num1*num2);
		}else if(operator.equals("/")) {
			System.out.printf("%d / %d = %.1f",num1,num2,num1/(double)num2);
		}else if(operator.equals("%") && num2 !=0) {
			System.out.printf("%d %% %d = %d",num1,num2,num1%num2);
		}
	}
}
