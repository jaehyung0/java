package com.test.question.array2;

public class Q06 {

	public static void main(String[] args) {
		
		int[][] nums = new int[5][5];
		int n=0;
		
		for(int i=0;i<nums.length;i++) {
			int sumgaro=0;
			
			for(int j=0;j<nums[0].length;j++) {
				
				if(i<nums.length-1&&j<nums.length-1) { //4x4에서 1~16까지 입력
					nums[i][j]=n+1;
					n++;
					
					sumgaro+=n;             //가로의 합
					//System.out.println(sumgaro);         
					
				}
				
				else if(j==nums[0].length-1){//마지막열
					
					nums[i][j]=sumgaro;  			//가로의 합 넣어주기
					
				}
				else if(i==nums.length-1) { //마지막행일때
					for(int k=0;k<nums.length-1;k++) {
						nums[i][k]+=nums[j][k]; //세로로 더해주기
						
					}
					
				}
						
			}//for
			
			for(int p=0;p<nums.length-1;p++) {  //마지막 총합
				for(int q=0;q<nums.length-1;q++) {
					nums[4][4]+=nums[p][q];
				}
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
