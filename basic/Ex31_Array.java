package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex31_Array {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//배열,Array
		//-자료형
		//-데이터의 집합 자료형
		//-자료 구조 > 수많은 데이터들을 사용 목적과 사용 용도에 맞게 저장하는 방식
		//		ex) 주문들 > 관리 > 어떤 형태 보관+저장+사용 > 줄지어 저장
		//-같은 자료형 변수를 모아놓은 집합 == 변수의 집합
		
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		m10();
		
	}

	private static void m10() {

		//배열 탐색 > 배열의 각 방을 원하는 순서대로 접근하는 행동
		//배열의 방 > 배열의 요소(Element)
		//배열의 방 번호 > 첨자(index)
		//배열의 방 개수 > 길이(length)
		
		int[] nums = new int[5];
		
		//1. 탐색 > 요소 1개 접근 방법 > 배열변수[방번호] : [index] -> 인덱서(Indexer)
		System.out.println(nums[0]);
		
		//2. 탐색 > 요소 N개 접근 > 루프 (for, while)
		// 배열의 탐색 -> for문 적합
		
		//*** 배열을 잘 사용하려면 for문을 잘 사용해야 된다.
		for(int i=0;i<nums.length;i++) {
			int n = nums[i]; //0~length-1
		}
		
		String str = "홍길동";
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i); //0~length -1
		}
		
		
		//값형 변수에는 nullsdl 대입할 수 없다. > 반드시 값을 가져야 한다!!
		//참조형 변수에는 null을 대입할 수 있따.
		int a=10;
		int[] b =new int[5];
		
		//a=null; --error
		b=null; //b를 비우겠다.  >배열 삭제
		System.out.println(b[1]);
		
		
		
	}

	private static void m9() {
		
		//배열 초기화
		//변수를 만들고 아직 초기화를 하지 않은 상태
		//-> 공간에 데이터가 없는상태
		int num;
		int[] nums =new int [5];
		
		//배열(참조형)은 방을 만든 직후에 사용자가 아무것도 하지 않아도 자동으로 방들이 초기화 된다. 
		//1. 정수 배열 -> 0
		//2. 실수 배열 -> 0.0
		//3. 문자 배열 -> \0(null)
		//4. 논리 배열 -> false
		//5. 참조형 배열 -> null
		
		System.out.println(nums[0]); //0
		
		double[] nums2 = new double[3];
		System.out.println(nums2[1]);
		
		boolean[] flags = new boolean[3];
		System.out.println(flags[0]);
		
		String[] strs = new String[3];
		System.out.println(strs[0]);
		
		
		//배열 초기화
		int[] nums3 = new int[5];
		nums3[0]=100;
		nums3[1]=200;
		nums3[2]=300;
		nums3[3]=400;
		nums3[4]=500;
		
		for (int i=0;i<nums3.length;i++) {
			nums3[i]= (i+1)*100;
			System.out.println(nums3[i]);
		}
		
		int[] nums4 = new int[5];
		
		nums4[0]=100;
		nums4[1]=200;
		nums4[2]=300;
		nums4[3]=400;
		nums4[4]=500;
		
		//배열의 초기화 리스트
		// -> 불규칙한 배열을 초기화 할 때 사용
		int[] nums5 = new int[] {100,200,500,300,400};
		
		int[] nums6 = {100,200,300,400,500};
		
		String[] names =new String[5];
		
		names[0] ="홍길동";
		names[1] ="김재형";
		names[2] ="김지형";
		names[3] ="김자형";
		names[4] ="김주형";
		
		//String[] names = {"김재형","김자형","김지형","김주형","김저형"};
		
		
		
	}
	
	

	private static void m8() {

		//배열 복사
		int[] nums1 = new int[3];
		int[] nums2;
		int[] nums3 = new int[3];
		
		nums1[0]=100;
		nums1[1]=200;
		nums1[2]=300;
		
		//주소값 복사
		//-얕은 복사
		//-Shallow Copy
		//-side effect o
		nums2 = nums1;
		
		//값 복사
		//-깊은 복사
		//deep copy
		//side effect x
		for (int i=0;i<nums1.length;i++) {
			//int = int 값형 복사
			nums3[i] = nums1[i];
		}
		
		nums1[0] = 1000;
		 System.out.println("nums1[0]:" +nums1[0]);
		 System.out.println("nums2[0]:" +nums2[0]);
		 System.out.println("nums3[0]:" +nums3[0]);
		
		
	}

	private static void m7() {

		//배열의 복사
		
		//값형의 복사
		int a=10;
		int b;
		
		b=a;
		a=20; //원본 수정
		
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		
		int[] nums1 = new int[3];
		int[] nums2;
		
		nums1[0]=100;
		nums1[1]=200;
		nums1[2]=300;
		
		for (int i=0; i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
		
		System.out.println();
		
		nums2 = nums1;   //데이터 복사가 아니라 주소가 복사되어 둘 중에 아무거나 변해도 둘다 변한다.
		
		for (int i=0; i<nums2.length;i++) {
			System.out.println(nums2[i]);
		}
		
		System.out.println();
		
		nums1[0]=1000;
		
		for (int i=0; i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
		
		System.out.println();
		
				
		for (int i=0; i<nums2.length;i++) {
			System.out.println(nums2[i]);    
		}
		System.out.println();
		
		//String은 물리적으로는 참조형에 속하지만 사용되는 형태나 성질은 값형에 가깝다.
		//너무나 많이 사용하는 자료형이라서 사용하기 불편한 참조형의 사용볍 대신에 사용하기 편한 값형으로도 사용된다.
		//String만 값형을 따르고 다른 참조형들을 참조형을 따른데.
		
		
		String s1 ="홍길동";
		String s2;
		
		s2=s1;
		s1="홍길동님";
		
		System.out.println(s2); //홍길동이나옴
		
		
		
	}

	private static void m6() throws NumberFormatException, IOException {

		//**메모리에 할당된 공간의 크기는 불변이다.
		// ==배열도 한번 방을 만들면 크기는 불면이다.
		// > 배열의 길이는 불변이다.
		
		//한번 만들어진 배열의 방의 개수는 절대로 늘이거나 줄일 수 없다. > 배열에 들어갈 데이터의 개수를 사전에 충분히 예측해야한다.
		
		//교장 선생님 > 상담 > 300명
		
		//정적 할당 > 컴파일 시 배열의 크기가 이미 정해진 상태
		int[] nums =new int[300]; 
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자입력: ");
		int num = Integer.parseInt(reader.readLine());

		int[] nums2 = new int[num];
		
		System.out.println(nums2.length);

		
		
		
	}

	private static void m5() {
		
		//각 자료형 배열
		//정수배열 byte short int long
		long[] array1 = new long[5];
		array1[0]=100L;
		System.out.println(array1[0]);
		
		//실수배열 double float
		double[] array2 = new double[5];
		array2[0]=3.14;
		System.out.println(array2[0]);
		
		//문자배열 char
		char[] array3 = new char[5];
		array3[0]='A';
		System.out.println(array3[0]);
		
		//논리배열 boolean
		boolean[] array4 = new boolean[5];
		array4[0]=true;
		System.out.println(array4[0]);
		
		//참조형
		String[] array5 = new String[5];
		array5[0]="홍길동";
		System.out.println(array5[0]);
		
		
	}

	private static void m4() {
		
		//배열
		//-참조형
		
		int n=100;
		boolean b=true;
		String s ="홍길동";
		
		//모든 참도형 변수는 int 변수이다.
		//-> 운영체제가 메모리 주소 번지를 기억할때 int형을 사용한다.
		
		int[] kors = new int[3];
		
		kors[0]=100;
		kors[1]=90;
		kors[2]=80;
		
		for (int i=0;i<kors.length;i++) {
			System.out.printf("kors[%d] = %d\n",i,kors[i]);
		}
		
		//문자열 -> 문자배열
		//String s1;
		//char[] s2;
		//문자열을 대상으로 한 행동들 == 배열을 대상으로 할 행동들
		
		
	}

	private static void m3() {
		//요구사항) 학생 3명 > 국어점수 > 총점, 평균
		//추가사항) 학생 300명
		
		int[] kors = new int[3];
		
		System.out.println(kors.length); //property, field
		
		for(int i=0;i<kors.length;i++) {
			kors[i] =100-10*i;
			
		}
		int total =0;
		
		for(int i=0;i<kors.length;i++) {
			total += kors[i]; //누적->총점
			
		}
		
		double avg = (double)total / kors.length;
		System.out.printf("총점은 %d점 평균%.1f점\n",total,avg);
		
		
	}

	private static void m2() {
		//배열사용
		//요구사항) 학생 3명 > 국어점수 > 총점, 평균
		//추가사항) 학생 300명
		
		//1. 배열 생성하기(선언)
		//2. 배열 사용하기(입력,출력)
		
		//자료형[] 배열변수명 = new 자료형[길이];
		//>int배열
		int[] kors = new int[3]; //int 방을 3개 만들어라
		int total = 0;
		for(int i=0;i<3;i++) {
			kors[i] = 100-10*i;
			total+=kors[i];
		}
		double avg = total /3.0;
		System.out.printf("총점은 %d점 평균%.1f점\n",total,avg);
		
		
	}

	private static void m1() {
		
		//요구사항) 학생 3명 > 국어점수 > 총점, 평균
		//추가사항) 학생 300명
		int kor1,kor2,kor3;
		
		kor1=100;
		kor2=90;
		kor3=80;
		
		int total = kor1+kor2+kor3;
		double avg = total / 3.0;
		
		System.out.printf("총점은 %d점 평균%.1f점\n",total,avg);

		
	}
}
