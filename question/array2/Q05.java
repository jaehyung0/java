package com.test.question.array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("한면의 정사각형 수(홀수만): ");
		int num = Integer.parseInt(reader.readLine());
		int center = num/2; //중앙값
		
		int value = 0;
		
		
		
		int[][] nums = new int[num][num];
		int n=1;
		
		for(int i=1;;i++) {			//상황에 맞는 변수 설정  5x5에서는 1필요 7x7에서는 2필요 9x9에서는 3필요 ...1씩 필요한게 늘어남
			if((num+i)==(3*i+1)) {	     //입력한 행 수와 필요한 변수의 합은 3의배수  5+1,7+2,9+3,11+4... 
				value=i;			//입력한 수에 i를 더하다가 원하는 3의 배수가 나오면 
				break;				
			}
		}
		
		for(int i=0;i<center+1;i++) {           //0행부터 입력이 제일 많이 될 행까지
			for(int j=center-i;j<center+1+i;j++) {  //0행은 1개 1행은 3개 3행은 5개 ~~ 2개씩 들어남
				
				nums[i][j]=n;
				n++;
			}		
		}
		
		for(int i=center+1;i<num;i++) {
			for(int j=i-center;j<num+value-i;j++) {  //<< 변수 대입
				nums[i][j]=n;
				n++;
			}
		}
		
		
		output(nums);
		
	}

	private static void output(int[][] nums) {

		for (int i=0; i<nums.length; i++) {
			for(int j=0;j<nums[0].length;j++) {
				System.out.printf("%3d",nums[i][j]);
			}
			System.out.println();
		}
	}
}
