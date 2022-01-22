package com.test.java.obj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Ex65_Exception {

	public static void main(String[] args) throws Exception {
		//예외,Exception
		//-컴파일 발견 X > 실행중(런타임) 발견 O
		//-개발자 미리 예측 O,X -> 발생 가능성이 있다.
		//-개발자가 모든 예외를 미리 예측하기 불가능하다.
		
		//예외 처리, Exception Handling
		//1.전통적인 방식
		//	-제어문 사용(조건문)
		//2.전용 예외처리 방식
		//	-try catch문 사용
		
		//m1();
		//m2();
		//m3();
		
		//최후의 저지선
		//-무슨일이 있어도 마지막인 main에서만큼은 예외처리를 하고 끝내야한다.
		try{
			//m4();
		}catch (Exception e) {
			
		}
		
		//m4();
		m5();
	}

	private static void m5() {
		//예외 던지기
		
		//요구사항) 입력 숫자 짝수면 에러
		int num = 2;
		if(num%2==1) {
			System.out.println("업무진행");
		}else {
			System.out.println("예외처리");
		}
		
		try {
			if(num%2==0) {
				//강제로 에러를 발생시킨다.
				//1.공을 만든다.
				//2.공을 던진다.
				throw new Exception();
			}
			System.out.println("업무진행");
		}catch(Exception e) {
			System.out.println("예외처리");
		}
		
	}

	private static void m4() throws Exception {
		
		//예외 미루기
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("라벨: ");
		//예외 직접처리
		try{
			String input = reader.readLine();
		} catch (Exception e) {
			System.out.println("입력 오류");
		}
		
		String input2 = reader.readLine();
		
		
	}

	private static void m3() {
		
		try {
			int num = 0;
			System.out.println(100/num); //new ArithmeticException(); 을 만듦
			
			
			int[] nums = {10,20,30};
			System.out.println(nums[5]);
			
			
			Parent p = new Parent();
			Child c;
			c=(Child)p;
			
			Random rnd = null;
			System.out.println(rnd.nextInt()); //new NullPointException()
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누기");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류");
		}catch (ClassCastException e) {
			System.out.println("형변환 오류");
		}catch (Exception e) {
			System.out.println("예외 처리");
		}
		
		
		//Exception - 최상위 클래스 
		//ArithmeticException, ArrayIndexOutOfBoundsException, ClassCastException -Exception 클래스의 서브 클래스
		
		
	}

	private static void m2() {
		
		//런타임 오류 발생 > 메시지 정리
		int num = 0;
		try {			
			System.out.println(100/num);
		} catch (Exception e){
				System.out.println("0을 입력하면 안됩니다.");
		}
		
		int[] nums = {10,20,30};
		try {
			System.out.println(nums[5]);
		}catch (Exception e){
			System.out.println("배열 첨자오류");
		}
		
		Parent p = new Parent();
		Child c;
		try {
			c=(Child)p;
		}catch (Exception e) {
			System.out.println("형변환 오류");
		}
		
		
		
	}

	private static void m1() {
		
		//요구사항) 숫자를 입력받아 연산을 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자입력:");	
		
		int num = scan.nextInt();
		
		//권장
		if(num!=0) {
			//비지니스 코드(업무 코드)
			System.out.printf("100/%d=%d\r\n",num,100/num);
		}else {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		//비권장
		if(num==0) {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
			
		}else {
			//비지니스 코드(업무 코드)
			System.out.printf("100/%d=%d\r\n",num,100/num);
		}
		
		//전문방식
		//-가독성 높음
		//-"num!=0" 조건이 안보임 >> 동작 방식이 다름
		//-if문: 사전에 미리 검사를 해서 사고가 안나게 처리
		//-try: 사고를 감지하다가 사고가 나면 처리
		
		try {
			//try블럭 == 비지니스 코드(업무 코드)
			System.out.println("하");
			System.out.printf("100/%d=%d\r\n",num,100/num);
			System.out.println("나");
		} catch (Exception e){
			//catch 블럭 > 예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
			
			//Exception e
			//- 예외가 발생한 상황의 여러가지 정보를 전달하는 객체
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("다른업무...");
		
		
	}
	
	
	
}

class Parent {
	
}

class Child extends Parent {
	
}







