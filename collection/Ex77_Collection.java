package com.test.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex77_Collection {

	public static void main(String[] args) {
		
		//컬렉션 탐색 도구
		//1.for문(index)
		//2.while문
		//3.향상된 for문
		//------------------------------제어문
		//4.Enumeration
		//5.Iterator(***)
		//6.ListIterator
		//------------------------------도구
		
		m1();
	}

	private static void m1() {
		//Iterator
		//-List, Set에서 사용
		//-읽기 전용으로 사용
		//-향상된 for문 유사
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("노트북");
		list.add("마우스");
		list.add("키보드");
		list.add("모니터");
		list.add("웹캠");
		
		//Iteratro를 지원하는 데이터 집합 -> iterator() 메소드 소유
		Iterator<String> iter = list.iterator();
		
		//Iterator객체의 메소드 2개
		//1.hasXXX()
		//2.nextXXX()
		
		//커서
		//-전진 커서(다음 방으로만 이동 가능, 이전 방으론 이동 불가)
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		for(String item : list) {
			System.out.println(item);
		}
	
		
	}
}
