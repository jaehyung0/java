package com.test.java.collection;

import java.util.Stack;

public class Ex68_Stack {

	public static void main(String[] args) {
		
		/*
		 * 
		 * ADT:Abstract Data Type(추상적 자료형)
		 * -자료 구조 중 하나
		 * -물리적인 특성을 가지는 것이 아니라 사용법의 특성을 가진다.
		 * -Stack, Queue > 물리구조 == 순수 배열
		 * 
		 * Stack
		 * -후입선출
		 * -LIFO: Last Input First Output
		 * ex) 메모리 구조(Stack), ctrl+z ,브라우저(뒤로가기, 앞으로가기)
		 * 
		 * 
		 * 
		 * Queue
		 * -선입선출
		 * -FIFO:First Input First Output
		 * 
		 */
		
		m1();
		m2();
		m3();
		
	}

	private static void m3() {
		// ctrl+z ,브라우저(뒤로가기, 앞으로가기)
		
		//워드 프로세서 작업중
		//1. 안넝하세요. 타이핑
		//2. 안넝 -> 안녕 수정
		//3. . > ,
		//4.홍길동님 추가
		
		Stack<String> history = new Stack<String>();
		Stack<String> redo = new Stack<String>();
		
		//1.안넝하세요. 타이핑
		System.out.println("안녕하세요");
		history.push("안넝하세요.");
		
		//2.안넝 > 안녕 수정
		System.out.println("안녕하세요.");
		history.push("안녕으로 수정");
		
		//3. . >, 로 수정
		System.out.println("안녕하세요,");
		history.push("쉼표로 교체");
		
		//4.홍길동님 추가
		System.out.println("안녕하세요, 홍길동님");
		history.push("홍길동님 추가");
		
		//5.마지막 작업 되돌리기
		String temp = history.pop();
		
		redo.push(temp);
		System.out.println("되돌리기 대상:" +  temp);
		
		//6.또 ctrl+z
		temp = history.pop();
		redo.push(temp);
		
		System.out.println("되돌리기 대상:" +  temp);
		
		//7. 방금 누른 ctrl+z > 다시 실행
		System.out.println("다시실행 대상:"+redo.pop());
		
		
		
	}

	private static void m2() {
		Stack<String> stack = new Stack<String>();
		
		//Stack
		//-push
		//-pop
		//-size()
		
		stack.push("빨강"	);
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("녹색");
		
		System.out.println(stack.peek()); //pop()처럼 데이터 읽기, 꺼내진 않는다.(삭제x)
		System.out.println(stack.peek()); //pop()처럼 데이터 읽기, 꺼내진 않는다.(삭제x)
		
		
		//pop는 데이터를 삭제하기 때문에 peek이나 get은 확인하는 용도로만 사용하자
		System.out.println(stack.indexOf("노랑"));
		System.out.println(stack.get(2));
		
	}

	private static void m1() {

		Stack<String> stack = new Stack<String>();
		
		//1.데이터 추가하기
		//- T push (T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		//2.요소 개수 확인하기
		System.out.println(stack.size());
		
		//3. 요소 읽기, 접근하기
		System.out.println(stack.pop()); //방번호 x + 파랑 삭제
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		//EmptyStackException
		//스택 비어있는지
		if(stack.size()>0) {
			System.out.println(stack.pop());
		}
		
		if(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
}
