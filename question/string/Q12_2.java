package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력: ");
		String calc = reader.readLine();
		
		int index = -1;
		index += calc.indexOf('+')+1;
		System.out.println(index);
		index += calc.indexOf("-")+1;
		System.out.println(index);
		index += calc.indexOf("/")+1;
		System.out.println(index);
		index += calc.indexOf("*")+1;
		System.out.println(index);
		index += calc.indexOf("%")+1;
		System.out.println(index);
		
		String frontnum = "";
		String backnum = "";
		
		if(index==-1) {
			System.out.println("연산자가 올바르지 않습니다.");
		}else {
									
			frontnum = calc.substring(0,index).trim();
			backnum = calc.substring(index+1).trim();
			
			if(frontnum.length()==0 || backnum.length()==0) {
				System.out.println("피연산자가 부족합니다.");
			}else {
				int a = Integer.parseInt(frontnum);
				int b = Integer.parseInt(backnum);
				
				if(calc.indexOf("+")!=-1) 
					System.out.printf("%d+%d=%d",a,b,a+b);
				
				else if(calc.indexOf("-")!=-1)
					System.out.printf("%d-%d=%d",a,b,a-b);
			
				else if(calc.indexOf("*")!=-1)
					System.out.printf("%d*%d=%d",a,b,a*b);
				
				else if(calc.indexOf("/")!=-1)
					System.out.printf("%d/%d=%d",a,b,a/b);
				
				else if(calc.indexOf("%")!=-1)
					System.out.printf("%d%%%d=%d",a,b,a%b);
				
			}
		
		}
	}
}