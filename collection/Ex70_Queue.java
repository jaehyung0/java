package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex70_Queue {

	public static void main(String[] args) {
		//Queue
		//-선입선출
		//-먼저 들어간것이 먼저 나온다.
		
		Stack<String> stack = new Stack<String>();
		
		//인터페이스
		//실제 객체는 LinkedList 형태이고, 외부에 노출된 사용법은 Queue이다.
		Queue<String> queue = new LinkedList<String>(); //Queue의 자식 클래스 LinkedList
		
		//1.요소 추가하기
		//- boolean add(T value)
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		
		//2.요소 개수
		System.out.println(queue.size());
		
		//3.요소읽기
		System.out.println(queue.poll()); //선입선출
		System.out.println(queue.size());
		System.out.println(queue.poll()); //선입선출
		System.out.println(queue.poll()); //선입선출
		//stack과는 다르게 에러가 안나고 null값 반환
		System.out.println(queue.poll()); //선입선출
		System.out.println(queue.poll()); //선입선출
		
		if(!queue.isEmpty()) {
			System.out.println(queue.poll()); //값이 없으면 null값
			System.out.println(queue.size());
		}
		
		queue.add("녹색");
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
		queue.clear();
		System.out.println(queue.size());
		
		//줄서기, 대기열 > Queue 사용
		//음식점 > 주문 > Queue 사용
		

		
		
		
		
	}
	
	
}
