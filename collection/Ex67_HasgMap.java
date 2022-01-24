package com.test.java.collection;

import java.util.HashMap;

public class Ex67_HasgMap {

	public static void main(String[] args) {
		
		/*
		 * 컬렉션 > ArrayList, HashMap 메인 > 나머지 컬렉션 서브
		 * 
		 * 1.ArrayList
		 * 	-요소 접근> 첨자(index) 사용
		 *  -순서가 있는 데이터 집합
		 *  -첨자(index) > 정수 사용(0부터 시작)
		 *  -스칼라 배열(Scalar Array)
		 *  -방을 일괄 접근 용이 > for루프
		 *  -요소끼리 구분이 모호함 > 방 번호는 의미를 가지지 않기 때문에
		 *  ex) 강의실 6개 > 1강의실....6강의실
		 *  
		 * 2.HashMap
		 * 	-요소접근 > 키(key) 사용
		 * 	-방 번호가 존재하지 않느다 > 요소의 순서가 없다.
		 *  -순서가 없는 데이티 집합
		 *  -키(key)와 값(value)으로 (한쌍) 데이터를 관리
		 *  -방을 일괄 접근 불리 > 루프 불가능
		 *  -요소의 의미를 알기 쉽다 >이름(key)
		 *  -key가 유일해야한다. (방을 구분하는 식별자라서)
		 *  ex) 강의실 6개 > 자바반, 파이썬반, DB반 ...이름(key)으로
		 * 
		 */
		
		m1();
		
	}

	private static void m1() {

		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//1.요소 추가
		//- U put(T key, U value)
		map.put("국어",100); //데이터
		map.put("영어",90); //데이터
		map.put("수학",80); //데이터
		
		//4.요소 수정
		// U put(T key, U value)
		// 동일한 key를 쓰면 수정된다.
		map.put("국어",99);
		
		//2.요소 개수
		//-int size()
		System.out.println(map.size());
		
		//3.요소 접근
		//-U get(T key)
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		
		//5.검색
		//- boolean containsKey(T key)
		//- boolean containsValue(U value)
		
		System.out.println(map.containsKey("국어"));
		System.out.println(map.containsValue(100));
		
		//6.삭제
		//- U remove(T key)
		map.remove("국어");
		System.out.println(map.size());
		
		//모든 컬럭션의 toString() 재정의되어있음.
		System.out.println(map.toString());
		
		//7.초기화
		map.clear();
	}
}
