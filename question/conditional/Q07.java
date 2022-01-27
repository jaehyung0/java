package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		oddeven();
	}

	private static void oddeven() throws NumberFormatException, IOException {
		System.out.println("1~10의 숫자만 입력해주세요.");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자입력:");
		int n1 = Integer.parseInt(reader.readLine());
		System.out.print("숫자입력:");
		int n2 = Integer.parseInt(reader.readLine());
		System.out.print("숫자입력:");
		int n3 = Integer.parseInt(reader.readLine());
		System.out.print("숫자입력:");
		int n4 = Integer.parseInt(reader.readLine());
		System.out.print("숫자입력:");
		int n5 = Integer.parseInt(reader.readLine());
		
		int odd = 0;
		int even =0;
		
		if((n1>0 && n1<=10)||(n2>0 && n2<=10)||(n3>0 && n3<=10)||(n4>0 && n4<=10)||(n5>0 && n5<=10)) {
			if(n1%2==0) 
				even++;
			else 
				odd++;
		
			if(n2%2==0) 
				even++;
			else 
				odd++;
			
			if(n3%2==0) 
				even++;
			else 
				odd++;
			
			if(n4%2==0) 
				even++;
			else 
				odd++;
			
			if(n5%2==0) 
				even++;
			else 
				odd++;
			
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.",even,odd);
		
		if(even>odd) {
			System.out.printf("짝수가 홀수보다 %d개 많습니다.",even-odd);
		}else {
			System.out.printf("홀수가 짝수보다 %d개 많습니다.",odd-even);
		}
		
	}

	}
}
	

