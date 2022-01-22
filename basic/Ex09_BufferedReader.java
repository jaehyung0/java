package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import > 별도의 공간에 있는 클래스를 사용하겠다고 선언(가져오기)
//java.lang 패키지
//- JDK 전체 중 유일한 기본 패키지(가장 기본적 + 가장 중요한 클래스 모아놓은 패키지)
//- import.java.lang.String 불필요

public class Ex09_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		//콘솔 입출력
		// - print(), println(), printf()
		// - read(), BufferedReader, Scanner
		
		
		//클래스 사용법
		
		//자료형 변수명;
		//int n;
		//String str;
		//BufferedReader reader;
		
		//String, BufferedReader > 클래스
		//String > 항상 접근할 수 있는 공간에 들어있는 클래스 (고추장, 간장, 설탕)
		//BufferedReader > 따로 보관해 놓은 공간에 들어있는 클래스(특이한 것)
		//클래스 > 코드의집합 > 구현된 기능의 집합 > 개발자가 특정 기능을 만들어 놓은 상자(클래스) 
		//> 다른 개발자들에게 사용하라고 전달 가능(클래스 단위로 주고 받는다.)	 
		//> 현시점 > JDK 안에 클래스가 너무 많다(약 8000개) > 이들 중 딱 1공간에 들어있는 클래스만 바로 사용이 가능하고, 나머지 공간에 들어있는 클래스는 가져오는 행동이 필요하다.
		
		// 요구사항) 문자 1개를 입력받아 그대로 출력하시오.
		//System.in.read();
		
		//System.in.read() -> 감싼 뒤 -> 개량 -> Wrapper Class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //도구 생성 < 키보드입력을 받을 수 있는 도구
		
		System.out.print("문자 입력:");
		
		//문자 코드값 반환
		int code = reader.read(); //대기상태
		
		System.out.println(code);
		System.out.printf("%c\n",code); 
		
		//현재 버퍼안에 \r\n이 남아있다. > 삭제!!
		reader.readLine(); 
		/*code = reader.read(); //대기상태
		
		System.out.println(code);
		System.out.printf("%c\n",code); 
		
		code = reader.read(); //대기상태
		
		System.out.println(code);
		System.out.printf("%c\n",code); */
		//가(44032)~힣(55203) > 11172개
		
		//요구사항) 사용자에게 이름(3문자)을 입력 받아 인사를 하시오.
		// - read() x 3회
		
		//reader.read() > 1문자 입력 > 문자코드(int) 반환
		//reader.readLine() > N문자(문자열) 입력 > 문자열(String) 반환
		// >> 입력 버퍼안에서 엔터값을 만나기 전까지의 문자열을 반환 + 남아있는 \r\n은 지워 버린다.
		System.out.print("이름입력:");
		String name = reader.readLine();
		System.out.printf("%s님. 안녕하세요.\n",name);
			
		System.out.print("나이 입력:");
		String age = reader.readLine();
		System.out.printf("당신의 나이는 %s살이군요.\n",age);
		
		
		/*에러, Error
		 * -오류, 버그, 예외(Exception) 등
		 * 1. 컴파일 에러
		 * -컴파일 작업중에 발생하는 에러
		 * -컴파일러 발견 > 문법이 틀렸다!!
		 * -이클립스 편집기의 빨간줄
		 * -컴파일 작업 중단 > 번역 중단 > 프로그램 생성 불가 > 반드시 해결!
		 * -난이도 가장 낮음 > 발견하기 쉽다. > 고치기 쉽다.
		 * -컴파일러가 친절하게 상황을 알려준다. (에러 메시지)
		 * -주로 오타
		 * 
		 * 2. 런타임 에러
		 * -컴파일때는 발견이 안됐는데 실행중에 발견되는 에러
		 * -문법에는 오류가 없는데 다른 원인으로 발생하는 에러
		 * -예외(Exception)
		 * -난이도 중간 > 발견 중간 > 복불복 > 테스트 발견O >조치, 발견x > 조치 x
		 * -대부분의 프로그램은 런타임 오류를 가지고 있다.
		 * -런타임(프로그램을 실행중)
		 * 
		 * 3. 논리 에러
		 * -문법도 틀린곳이 없고, 실행도 잘되는데 > 결과가 이상함
		 * -발견 최악, 수정최악 , 찾기가 너무 힘듬 > 문법O, 실행O
		 * -해결방법> 한줄한줄 직접 눈으로 확인
		 * -개발자가 정신 차리면 됨
		 * 
		 * 컴파일 에러 + 런타임 에러
		 * - 정리 노트
		 * -제목, 상황, 에러메시지, 에러발생
		 * 
		 * 개발 실력 향상 시키는 방법
		 * 1. 프로그램 만들어보기
		 * 2. 도큐먼트 보기 (도움말 보는 연습)
		 * 3. 에러 노트 정리하기
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}
}
