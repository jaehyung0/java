package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("컴퓨터가 1~10사이의 숫자를 1개 생각했습니다.");
		
		int num = (int)(Math.random()*10)+1;
		
		for(int i=0;;i++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("숫자:");
			int enterNum = Integer.parseInt(reader.readLine());
				i++;
				
			if(num!=enterNum) {
				System.out.println("틀렸습니다.");
				
			}else {
				
				System.out.println("맞췄습니다.");
				System.out.println();
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n",num);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.",i=i/2+1);
				
				break;
			}
		}
		
		
	}
}
