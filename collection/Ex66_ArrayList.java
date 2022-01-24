package com.test.java.collection;

import java.util.ArrayList;

public class Ex66_ArrayList {

	public static void main(String[] args) {
		
		//컬렉션, Collection
		//-JCF, Jaca Collections Framework
		//-(향상된)배열
		//-기존의 순수 배열을 성능이나 사용법에 버전업한 배열
		//-길이 가면(늘리거나 줄이는게 가능)
		//-1.사용법
		//-2.구조
		//-자료구조
		
		//ArrayList 클래스
		//-ArrayList(C) -> List(I) -> Collection(I)
		//   자식             아빠         할아버지      
		//-순수 배열하고 구조가 가장 유사함
		//-사용 빈도가 가장 높음
		//-첨자(index)를 사용해서 요소(elemetn)에 접근/제어
		
		//m1();
		//m2();
		m3();
		//m4();
		//m5();
		
	}

	private static void m5() {

		//컬렉션의 길이
		// -> 가변(자동으로 늘어나거나 줄어든다.) > 물리적으로 불가능 이야기
		// -> 가변처럼 보이도록 내부에서 조작 -> 배열을 늘려서 교체하는 작업을 통해서 -> 개발자 편하라고
		
		ArrayList<Integer> list = new ArrayList<Integer>(1025);
		
		//1025회 반복 > 안좋은 코드
		for (int i=0;i<1025;i++) {
			list.add(i);
		}
		System.out.println(list.size());
		
		//안좋은 코드 > 조건: 이 배열은 더이상 데이터를 추가하지 않겠다.
		list.add(10000);
		System.out.println(list.size()); //방은2050개있지만 1026까지만 차있어서 별로
		
		//이 배열은 더이상 데이터를 추가하지 않겠다.
		list.trimToSize(); //1026개
		
		//배열의 길이
		//-list.length()
		//	-> 실제 공간의 길이
		
		//컬렉션의 길이
		//-list.size();
		//  -> 배열이 차있는 길이
	}

	private static void m4() {
		
		//숫자배열
		//int[] list1
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		//문자배열
		//String[ list2
		ArrayList<String> list2 = new ArrayList<String>();
		
		//User배열
		//User[] list3
		//객체배열
		ArrayList<User> list3 = new ArrayList<User>();
		
		list3.add(new User("홍길동"));
		
		User u = new User("아무개");
		list3.add(u);
		
	}

	private static void m3() {
		//ArrayList 사용법
		ArrayList<String> list = new ArrayList<String>();
		
		//1.요소 추가하기
		//-void add(T value)
		//-배열의 맨 마지막에 추가하기(append mode)
		
		list.add("빨강");
		list.add("노랑");
		list.add("파랑");
		list.add("주황");
		list.add("녹색");
		
		//2.요소의 개수
		//-int size()
		System.out.println(list.size());
		
		//3.요소의 접근
		//-T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1)); //마지막방
		//System.out.println(list.get(5)); //IndexOutOfBoundsException
		
		//4.요소의 수정
		//-list[0]=100; 대입 or 수정 같음
		list.set(0, "분홍");
		System.out.println(list.get(0));
		
		//5.요소의 삭제
		//-순수 배열은 요소 삭제 불가능
		//-컬렉션은 요소 삭제 가능
		//-T remove(int index)
		//-boolean remove(T value)
		System.out.println(list.size());
		System.out.println(list.get(3)); //주황
		list.remove(2); //파랑삭제
		System.out.println(list.get(2)); //주황   지우면 지운곳으로 한칸씩 떙겨진다.
		System.out.println(list.get(3)); //녹색   지우면 지운곳으로 한칸씩 떙겨진다.
		System.out.println(list.size());
		System.out.println();
		
		//6.요소탐색
		//-루프
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		//7.요소 추가
		//-배열의 원하는 위치에 추가
		//-void add(int index, T value) Insert
		
		list.add(1,"하얀");
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		//8.검색
		//- int indexOf(T value)
		//- boolean contains(T value)
		
		System.out.println(list.indexOf("노랑"));
		System.out.println(list.indexOf("검정"));
		System.out.println(list.lastIndexOf("노랑"));
		
		System.out.println(list.contains("노랑")); //true 있다.
		System.out.println(list.contains("검정")); //false 없다.
		System.out.println();
		//9.초기화
		//-모든 방 삭제
		//-void clear()
		
		list.clear();
		
		System.out.println(list.size());
		System.out.println();
		
		//10.빈배열 확인
		System.out.println(list.size()==0);
		System.out.println(list.isEmpty());
		
//		나중에 할만 한것들
//		list.addAll(list);
//		list.forEach(null);
//		list.iterator();
//		list.listIterator();
//		list.sort(null);
//		list.stream()
		
	}

	private static void m2() {
		//ArrayList is a raw type. > 좀 오래된 웬만하면 안썼으면 좋겠다.
		//References to generic type ArrayList<E> should be parameterized
		//object 배열
		ArrayList nums1 = new ArrayList();
		nums1.add(10);
		System.out.println(nums1.get(0));
		System.out.println((int)nums1.get(0)*2);
		
		//Generic 컬렉션
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(10);
		nums2.add(30);
		System.out.println(nums2.get(0));
		
		
	}

	private static void m1() {

		//배열
		//-배열 선언
		//-타입 명시(int), 길이 명시(3)
		int[] nums1 = new int[3];
		
		//초기화 + 요소 접근 > 첨자(index) 사용
		nums1[0]=10;
		nums1[1]=20;
		nums1[2]=30;
		System.out.println(nums1[0]);
		
		for(int i=0;i<nums1.length;i++) {
			System.out.println(nums1[i]);
		}
		System.out.println();
		
		//ArrayList
		//-ArrayList 선언
		//-평범한 클래스 객체 생성의 모습
		//-타입 명시(X) > Object배열 > 모든걸 담을 수 있는 배열
		//-길이 명시(X) > 가변
		ArrayList nums2 = new ArrayList();
		
		//초기화 + 요소 접근
		//nums2[0] =10; < 순수 배열만 indexer 표현을 사용할 수 있다.
		nums2.add(10); //배열의 마지막방에 데이터를 추가하시오.(Append) 0번째방
		nums2.add(20); //1번쨰방
		nums2.add(30); //2번째방
		
		
		System.out.println(nums2.get(0));
		System.out.println(nums2.get(1));
		System.out.println(nums2.get(2));
		
		for(int i=0;i<nums2.size();i++) {
			System.out.println(nums2.get(i));
		}
		
		
	}
}

class User {
	private String name;

	public User(String name) {
		
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
}

//ArrayList 클래스
//class TestList {
//	
//	private Object[] list;
//	
//}
//
//class TestList<T> {
//	
//	private T[] list;
//	
//}

//class TestList {
//	
//	private int[] list;
//	private int index;
//	
//	
//	public TestList(int[] list) {
//		super();
//		this.list = new int[4];
//		this.index=0;
//	}
//	
//	public void add(int n) {
//		
//		if(검사-배열이 꽉찼는지? 빈방이 없는지?) {
//			int[] temp = new int[this.list.length*2]; //8칸짜리
//			
//			for () {
//				temp[i]=this.list[i];
//			}
//			
//			this.list=temp; // 4칸짜리를 버리고 8칸짜리로 교체
//		}
//		
//		this.list[this.index]=n;
//		this.index++;
//	}
//	
//	
//	
//	
//}
