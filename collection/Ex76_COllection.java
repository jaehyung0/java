package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ex76_COllection {

	public static void main(String[] args) {
		
		/*
		 * ArrayList, HashMap, Stack ,Queue
		 * 
		 * 자바 컬렉션의 관련 인터페이스
		 * 1.Collection
		 * 	-List와 Set의 부모 인터페이스
		 * 
		 * 2.List
		 * 	-ArrayList, Stack, Queue, LinkedList, Vector
		 * 	-순서가 있는 데이터 집합(***********)
		 * 	-방번호가 있다. -> 첨자(index)를 사용한다. -> 요소 접근
		 * 	-순수 배열과 유사
		 * 	-데이터 중복을 허용한다. -> 방번호가 유일하기 때문에 동일한 데이터라도 방번호를 통해서 구분한다.
		 * 
		 * 3.Set
		 * 	-HashSet, TreeSet
		 * 	-순서가 없는 데이터 집합
		 * 	-방번호가 없다. 첨자 사용 안함
		 * 	-데이터 중복을 허용하지 않는다.(******)
		 * 
		 * 4.Map
		 * 	-HashMap, TreeMap, HashTable, Properties
		 * 	-순서가 없는 데이터 집합
		 * 	-방번호가 없다. -> 키를 사용한다.
		 * 	-키와 값을 사용 -> 연관 배열, 사전 구조(dictionary)
		 * 	-key -> value
		 * 	-키(key): 식별자 역할 -> 유일해야한다.
		 *  -값(value): 데이터 -> 중복 허용한다.
		 * 
		 * 
		 * 
		 * 면접
		 * 1.질문: OOO에 대해서 설명하세요.
		 * 2.답변:
		 * 		a.장황하게 설명
		 * 		b.단답으로 설명
		 * 
		 */
		
		//m1();\
		//m2();
		m3();
		
	}

	private static void m3() {
		//ArrayList vs LinkedList
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		
		long begin =0,end=0;
		
		//1.순차적으로 데이터 추가하기
		System.out.println("[순차적으로 데이터 추가하기]");
		
		begin = System.nanoTime();
		
		for(int i=0; i<1000000; i++) {
			nums1.add(i); //배열의 끝에 추가 > Append
		}
		
		end = System.nanoTime();
		System.out.printf("ArrayList작업시간: %,dns\r\n",end-begin);
		
		
		
		begin = System.nanoTime();
		
		for(int i=0; i<1000000; i++) {
			nums2.add(i); //배열의 끝에 추가 > Append
		}
		
		end = System.nanoTime();
		System.out.printf("LinkedList작업시간: %,dns\r\n",end-begin);	
		
		System.out.println("================================");
		
		
		//2.배열 중간에 데이터를 추가하기(insert+shift 발생)
		System.out.println();
		System.out.println("[배열 중간에 데이터를 추가하기]");
		
		begin = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			nums1.add(0,i); //배열의 끝에 추가 > Append
		}
		
		end = System.nanoTime();
		System.out.printf("ArrayList작업시간: %,dns\r\n",end-begin);
		
		
		
		
		begin = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			nums2.add(0,i); //배열의 끝에 추가 > Append
		}
		
		end = System.nanoTime();
		System.out.printf("LinkedList작업시간: %,dns\r\n",end-begin);
		
		System.out.println("================================");
		
		//3.배열 중간에 데이터를 삭제하기
		System.out.println("[배열 중간에 데이터를 삭제하기]");
		
		begin = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			nums1.remove(0); //배열의 끝에 추가 > Append
		}
		
		end = System.nanoTime();
		System.out.printf("ArrayList작업시간: %,dns\r\n",end-begin);
		
		
		
		begin = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			nums2.remove(0); //배열의 끝에 추가 > Append
		}
		
		end = System.nanoTime();
		System.out.printf("LinkedList작업시간: %,dns\r\n",end-begin);
		
		
		System.out.println("================================");
		
		
		
		//4.순차적으로 데이터를 삭제하기. 끝->처음. shirt 발생 x
		System.out.println("[순차적으로 데이터를 삭제하기]");
		
		begin = System.nanoTime();
		
		for(int i=nums1.size()-1; i>=0; i--) {
			nums1.remove(i); 
		}
		
		end = System.nanoTime();
		System.out.printf("ArrayList작업시간: %,dns\r\n",end-begin);
		
		
		
		begin = System.nanoTime();
		
		for(int i=nums2.size()-1; i>=0; i--) {
			nums2.remove(i);
		}
		
		end = System.nanoTime();
		System.out.printf("LinkedList작업시간: %,dns\r\n",end-begin);
		
		System.out.println("=============================");
		
		//개별요소 탐색
		System.out.println("개별 요소 탐색");
		for( int i=0;i<1000000;i++) {
			nums1.add(i);
		}
		
		for( int i=0;i<1000000;i++) {
			nums2.add(i);
		}
		
		begin = System.nanoTime();
		
		System.out.println(nums1.get(500000));
		
		end = System.nanoTime();
		System.out.printf("LinkedList작업시간: %,dns\r\n",end-begin);
		
		begin = System.nanoTime();
		
		System.out.println(nums2.get(500000));
		
		end = System.nanoTime();
		System.out.printf("LinkedList작업시간: %,dns\r\n",end-begin);
		
		
		
	}

	private static void m2() {
		//List 계엘의 대표 컬렉션
		//1.ArrayList
		//2.LinkedList
		
		//LinkedList 종류
		//1. LinkedList : 일방
		//2. Double LinkedList : 양방향
		//3. Double Circular LinkedList : 양방향 + 처음-끝 연결
		
		//자바의 LinkedList는 Doublie Circular LinkedList이다.
		
		//ArrayList
		//-모든 컬렉션을 통틀어 요소에 접근하는 속도가 가장 빠르다.
		//-요소의 중간 삽입, 삭제에 비용이 많이 발생한다.
		
		//LinkedList
		//-요소에 접근하는 속도가 느리다.(특히 뒤에 있는 요소 일수록)
		//-요소의 중간 삽입, 삭제에 비용이 적다.
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		for(int i=0;i<nums1.size();i++) {
			System.out.println(nums1.get(i));
		}
		
		for(int i=0;i<nums2.size();i++) {
			System.out.println(nums2.get(i));
		}
		
	}

	private static void m1() {
		ArrayList<String> list1 = new ArrayList<String>();
		Vector<String> list2 = new Vector<String>();
		
		list1.add("홍길동");
		list1.add("아무개");
		list1.add("테스트");
		
		list2.add("빨강");
		list2.add("파랑");
		list2.add("노랑");
		
		System.out.println(list1.size());
		System.out.println(list2.size());
		
		System.out.println(list1.get(0));
		System.out.println(list2.get(0));
		
	}
}
