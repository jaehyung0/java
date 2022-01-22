package com.test.java.obj.inheritance;

import java.util.Random;

public class Ex52_Inheritance {

	public static void main(String[] args) {
		
		
		//m1();
		m2();
		
		
	}

	private static void m2() {
		//요구사항) 난수 생성기를 만드시오.
		//상황) 개발자. 담당업무 > 난수 발생 코드 잦은 사용
		//1. -21억
		//2. 1~10 정수
		//3. 색상 난수:red,yellow,blue,orange,green
		
		
		
		//work1();
		//work2();
		//work3();
		work4();
		
	}

	private static void work4() {
		//도구 통합 + 기존의 Random을 추가 구현없이 사용가능 > 상속
		UtilRandom rnd = new UtilRandom();
		//1.
		System.out.println(rnd.nextInt());
		
		//2
		System.out.println(rnd.nextTinyInt());
		
		//3
		System.out.println(rnd.nextColor());
		
		//4
		System.out.println(rnd.nextBoolean());
		
	}

	private static void work3() {
		MyRandom rnd = new MyRandom();
		
		//1.
		System.out.println(rnd.nextInt());
		
		//2.
		System.out.println(rnd.nextTinyInt());
		
		//3.
		System.out.println(rnd.nextColor());
		
		
	}

	private static void work2() {
		Random rnd = new Random();
		MyRandom myrnd = new MyRandom();
		
		
		//1.
		System.out.println(rnd.nextInt());
		
		//2.
		System.out.println(myrnd.nextTinyInt());
		
		//3.
		System.out.println(myrnd.nextColor());
	}

	private static void work1() {
		Random random = new Random();
		//1.
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());

		//2.
		System.out.println(random.nextInt(10)+1);
		
		//3.
		String[] colors = {"red","yellow","blue","orange","green"};
		System.out.println(colors[random.nextInt(5)]);
		
	}

	private static void m1() {
		//난수 생성
		//1. Math.randon()
		//2. Random 클래스
		
		//0~9사이 난수
		for(int i=0;i<10;i++) {
			System.out.println(getRandom(10));
		}
		
		//Random 클래스
		
		Random random = new Random();
		
		for(int i=0;i<10;i++) {
			//System.out.println(random.nextInt()); //-21억~21억 정수 난수
 			//System.out.println(random.nextDouble()); //0~1 실수 난수
 			//System.out.println(random.nextBoolean()); //true false 난수
 			//System.out.println(random.nextLong());  //제일 큰 정수 난수
 			System.out.println(random.nextInt(10));  //사용 제일 많이함 0~9
		}
		
		
	}
	
	public static int getRandom(int max) {
		return (int)(Math.random()*max);
	}
}
