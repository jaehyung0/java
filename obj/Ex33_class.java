package com.test.java.obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex33_class {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * 클래스, Class
		 * 
		 * 프로그래밍 언어(기술)의 분류
		 * 1. 절차 지향 프로그래밍
		 * 	- 흐름을 중시한다.
		 * 	- C언어
		 * 
		 * 2. 객체 지향 프로그래밍
		 * 	- 객체를 중시한다.
		 * 	- 프로그램을 객체를 중심으로 작성하는 방식
		 * 	- C++언어, Java, C#
		 * 
		 * 3. 함수형(함수 지향) 프로그래밍
		 * 	- 함수 위주
		 * 	- F#, Kotlin
		 * 
		 * 
		 * 객체, Object
		 * - 데이터 + 행동 = 집합
		 * - 독자성, Identity -> 객체는 유일해야한다.
		 * - 상태, State -> 데이터의 다른 말 -> 다른 객체와 구분이 가능하다.
		 * - 행동, Behavior -> 객체의 행동은 주로 자신의 데이터를 활용해서 한다.
		 * - 캡슐화, Encapsulation -> 모든 객체는 보호막으로 자신 감싸서 보호한다. -> 왜? -> 내부 내용물을 보호하기 위해서
		 *     -> 외부와의 (올바른) 통로를 제공하기 위해서
		 * - 인터페이스, Interface -> 캡슐화된 상태에서 외부와 의사소통을 하기 위해 뚫어 놓은 구멍    
		 * 
		 * 
		 * 클래스, 객체 ,인스턴스
		 * - 클래스는 객체의 설계도이다.
		 * 
		 * 클래스, Class
		 * - 설계도 추상적
		 * -붕어빵 틀
		 * 
		 * 객체, Object
		 * - 사물, 제품
		 * - 붕어빵
		 *  
		 * 인스턴스. Instance
		 * - 메모리상에 실체화된 객체를 말한다.
		 * 
		 * 
		 * 어떤 데이터를 가지며, 어떤 행동을 할 수 있는 무언가를 하나 가지고 싶다. -> 이런 데이터와 이런 행동을 할 수 있는 능력을 
		 * 	설계한 설계도를 먼저 만든다 -> 설계도를 기반으로 무언가를 만든다. -> 무언가를 사용한다.
		 * 
		 * 
		 * 필드+메소드=객체 -> 객체를 만들 수 있는 클래스를 먼저 선언한다. -> 클래스를 사용해서 실제 객체 생성한다.
		 *   -> 생성된 객체를 사용해서 여러가지 업무를 진행한다.
		 *   
		 *  
		 */
		
		/*클래스 구문
		 * 
		 * 1. 클래스 선언, 클래스 정의
		 * 
		 * class 클래스명 {
		 * 		//설계내용 > 클래스 멤버
		 * 		1.멤버 변수  >> 성질, 상태, 데이터
		 * 		2.멤버 메소드 >> 행동, 기능
		 * }
		 * 
		 * 2. 클래스 사용 -> 객체 생성
		 * 
		 * 클래스명 객체명 = new 생성자();
		 * 
		 * 
		 */
	
		//요구사항) 지도 -> 우리집의 좌표 -> 저장 -> 사용
		//case 1.
		//우리집 좌표
		
		int x=100;
		int y=200;
		
		//마트 좌표
		int x2=300;
		int y2=400;
		
		System.out.printf("우리집은 (%d,%d)에 위치합니다.\n",x,y);
		
		
		//case 2.
		//- 물리적 공간 제공 -> 안정적
		//- 데이터의 구체적인 성질을 알기 힘들다. -> 요소의 성질
		//- 배열의 단점 -> 요소간의 성질을 구분하기 힘들다. -> 방번호 밖에 없어서
		int[] a1 = new int[] {100,200}; //우리집 좌표
		int[] a2 = new int[] {300,400}; //마트 좌표
		
		System.out.printf("우리집은 (%d,%d)에 위치합니다.\n",a1[0],a1[1]);
		
		
		//case 3.
		//-클래스 사용
		//-Point: 클래스, 붕어빵틀, 설계도
		//-p1: 객체, 붕어빵, 우리의 목적 > 인스턴스
		
		Point p1 = new Point();
		
		//'.' : 멤버 접근 연산자
		p1.x=100;	
		p1.y=200;
		
		Point p2 = new Point();
		p2.x=300;
		p2.y=400;
		
		System.out.printf("우리집은 (%d,%d)에 위치합니다.\n",p1.x,p1.y);
		System.out.printf("마트는 (%d,%d)에 위치합니다.\n",p2.x,p2.y);
		
		//클래스 vs 배열
		//- 둘 다 데이터의 집합
		//- 배열: 요소를 첨자(index)로 접근 > 루프 조작 가능, 가독성 낮음
		//- 클래스: 요소를 이름(name)으로 접근 > 루프 조작 불가능, 가독성 높으
		
		
		//사물의 크기 저장
		//-요소가 서로 다른 집합을 만들고자 할때
		//-width(너비), height(높이), name(사물의 이름)
		
		//int[] size = new int[3];  //{100,200,"핸드폰"}   자료형이 동일하지 않아서 int로는 사용못함
		//String[] size = new String[3]; //{100,200,"핸드폰"}  이름때문에 너비,높이를 문자형으로 만드는건 안좋음
		
		Size s1 = new Size();
		s1.name="키보드"; //멤버 변수, 객체의 데이터, 객체의 상태(State)
		s1.width=500;
		s1.height=200;
		
		Size s2 = new Size();
		s2.name="모니터";
		s2.width=10000;
		s2.height=5000;
		
		//성적 저장 단위
		//- 학생 이름, 국어점수, 영어점수, 수학점수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("점수: ");
		int score1 = Integer.parseInt(reader.readLine());

		System.out.print("점수: ");
		int score2 = Integer.parseInt(reader.readLine());
		System.out.print("점수: ");
		int score3 = Integer.parseInt(reader.readLine());

		Score hong = new Score();
		hong.name="홍길동";
		hong.kor=score1;
		hong.eng=score2;
		hong.math=score3;;
		System.out.printf("%s의 성적:%d %d %d\n",hong.name,hong.kor,hong.eng,hong.math);
	}
}//Ex33_Class

//원시형
//클래스 == (사용자 정의) 자료형
/*
 * 자바의 자료형
 * 1.원시형,값형
 * - 처음부터 이미 정의되어 제공되는 자료형
 * - 레고블럭 조각
 * 
 * 2.참조형(=클래스)
 * -배열
 * -문자열
 * -클래스
 * 		-기존의 자료형을 사용자가 조합해서 만든 자료형
 * 		-레고블럭 조각으로 만든 결과물
 * 
 */

//클래스 선언 위치
class Point {
	//내용물 -> 변수, 메소드
	public int x;
	public int y;
	
}

class Size {
	public int width;
	public int height;
	public String name;
}

class Score {
	public String name;
	public int kor;
	public int eng;
	public int math;
}






