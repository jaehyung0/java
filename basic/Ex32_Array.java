package com.test.java;

public class Ex32_Array {

	public static void main(String[] args) {
		
		//다차원배열
		
		//배열의 차원
		//1차원 2차원 3차원 ~~~ N차원
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		//문제 풀이 베이스
		int[][] nums = new int[5][5];
		
		int n=1;
		
		for (int i=0; i<nums.length; i++) {
			
				switch(i) {
				case 0:
				case 2:
				case 4:
					for(int j=0;j<nums[0].length;j++) {
					nums[i][j]=n;
					n++;}
					break;
				case 1:
				case 3:	
					for(int j=nums[0].length-1;j>=0;j--) {
						nums[i][j]=n;
					n++;}
					break;	
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

	private static void m2() {
		
		//배열 초기화 리스트
		
		//1차원배열
		int[] nums1 = {100,200,300};
		//2차원배열
		int[][]	nums2 = {{100,200,300},{400,500,600}};
		//3차원배열
		int[][][] nums3 = {{{100,200,300},{400,500,600}},{{100,200,300},{400,500,600}},{{100,200,300},{400,500,600}}};
		
		int[][][] nums4 =
			{
				{
					{100,200,300},{400,500,600}
				},
				{
					{100,200,300},{400,500,600}
				},
				{
					{100,200,300},{400,500,600}
				}
			};
				
		
		
		
	}

	private static void m1() {
		
		//1차원 배열
		int[] nums1 = new int[3];
		
		//2차원 배열
		int[][] nums2 = new int[2][3];	//2행 3열
		
		//3차원 배열
		int[][][] nums3 = new int[2][2][3]; // 2면 2행 3열
		
		//1차원 배열 > 첨자 1개
		nums1[0]=100;
		nums1[1]=200;
		nums1[2]=300;
		
		//2차원 배열 > 첨자 2개
		nums2[0][0]=100;
		nums2[0][1]=200;
		nums2[0][2]=300;
		nums2[1][0]=400;
		nums2[1][1]=500;
		nums2[1][2]=600;
		//int i=0;
		//int j=0;
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print(nums2[i][j]);
			if (i==1)
				System.out.println();
			
			}
		}	
		
		
		//1차원 배열
		for (int i=0;i<nums1.length;i++)
			System.out.printf("nums1[%d] = %d\n",i,nums1[i]);
		
		System.out.println();
		
		//2차원 배열
		for (int i=0;i<nums2.length;i++) {
			for (int j=0;j<nums2[0].length;j++) {
				System.out.printf("nums2[%d][%d] = %d\n",i,j,nums2[i][j]);
			}
		}
		
		//3차원 배열
		for (int i=0;i<nums3.length;i++) {
			for(int j=0;j<nums3[0].length;j++) {
				for(int k=0;k<nums3[0][0].length;k++) {
					nums3[i][j][k]=100+i+j+k;
					System.out.printf("%d\n",nums3[i][j][k]);
				}
			}
		}
		
		//배열의 길이(=방의 개수)
		//1차원 new int[3];
		System.out.println(nums1.length);
		System.out.println();
		//2차원 new int[2][3];
		System.out.println(nums2.length);   //2
		System.out.println(nums2[0].length); //1
		
		//3차원 new int[2][2][3];
		System.out.println(nums3.length);//3
		System.out.println(nums3[0].length);//2
		System.out.println(nums3[0][0].length);//1
		
	}
}
