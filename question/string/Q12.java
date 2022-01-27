package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력: ");
		String calc = reader.readLine();
		
		String frontnum = "";
		String backnum = "";
		int index = 0;
		
		
			if(calc.indexOf("+")!=-1) {
				
				index = calc.indexOf("+");
				frontnum = calc.substring(0,index).trim();
				backnum = calc.substring(index+1).trim();
				int a = Integer.parseInt(frontnum);		
				int b = Integer.parseInt(backnum);	
				System.out.printf("%s =%d",calc,a+b);
			}
			else if(calc.indexOf("-")!=-1) {
			
				index = calc.indexOf("-");
				frontnum = calc.substring(0,index).trim();
				backnum = calc.substring(index+1).trim();
				int a = Integer.parseInt(frontnum);		
				int b = Integer.parseInt(backnum);	
				System.out.printf("%s =%d",calc,a-b);
			}
			else if(calc.indexOf("*")!=-1) {
			
				index = calc.indexOf("*");
				frontnum = calc.substring(0,index).trim();
				backnum = calc.substring(index+1).trim();
				int a = Integer.parseInt(frontnum);		
				int b = Integer.parseInt(backnum);	
				System.out.printf("%s =%d",calc,a*b);
			}
			else if(calc.indexOf("/")!=-1) {
			
				index = calc.indexOf("/");
				frontnum = calc.substring(0,index).trim();
				backnum = calc.substring(index+1).trim();
				int a = Integer.parseInt(frontnum);		
				int b = Integer.parseInt(backnum);	
				System.out.printf("%s =%d",calc,a/b);
			}
			else if(calc.indexOf("%")!=-1) {
			
				index = calc.indexOf("%");
				frontnum = calc.substring(0,index).trim();
				backnum = calc.substring(index+1).trim();
				int a = Integer.parseInt(frontnum);		
				int b = Integer.parseInt(backnum);	
				System.out.printf("%s =%d",calc,a%b);
			}
		
		}	
			
			
	
}
