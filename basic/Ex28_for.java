package com.test.java;

public class Ex28_for {

	public static void main(String[] args) {
		
		//제어문 중첩
		//-모든 제어문은 종류에 상관없이 서로 중첩할 수 있다.
		
		//for문끼리 중첩
		//-N중 for문, 다중 for문
		
		//m1();
		//m2();
		//m3();
		m4();
	}

	private static void m4() {

		//별찍기
		for (int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		
		
		for (int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		for (int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		for (int i=0;i<5;i++) {
			for(int j=0;j<(4-i);j++) {
			System.out.print(" ");}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		
		
	}

	private static void m3() {
		
		for (int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				if (j==5) {
					break; //직접 감싸진 for문만 탈출
				}
				System.out.printf("i: %d, j: %d\n",i,j);
			}
		}
		
		
	}

	private static void m2() {
		
		//구구단
		for(int i=2;i<10;i++) {
			System.out.printf("%d단\n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
		
	}

	private static void m1() {
		//2중 for문
		/*for (int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				//System.out.println("안녕하세요."); //100번 찍힘
				System.out.printf("i: %d, j: %d\n",i,j);
			}
		}*/
		
		//3중 for문
		for (int i=0;i<10;i++) {
			
			for(int j=0;j<10;j++) {
				
				for(int k=0;k<10;k++) {
					System.out.printf("i: %d, j: %d, k: %d\n",i,j,k);
				}
			}
		}
	}
}
