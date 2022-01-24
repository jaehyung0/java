package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.annotation.processing.AbstractProcessor;

import com.test.data.Data;
import com.test.data.User;



public class Ex87_Stream {

	public static void main(String[] args) {
		
		/*
		 * 자바 스트림
		 * 1. 입출력 스트림
		 * 		- 파일 입출력, 콘솔 입출력, 네트워크 입출력 등..
		 * 
		 * 2.스트림
		 * 		- Java 8(JDK 1.8) + 람다식
		 * 		- 배열, 컬렉션의 탐색 지원
		 * 		- 파일 입출력 지원
		 * 		- 디렉토리 탐색 지원
		 * 
		 * 
		 * 배열, 컬렉션 탐색
		 * 1.for문
		 * 2.향상된 for문
		 * 3.iterator
		 * 4.스트림
		 * 
		 * 
		 * 람다식
		 * - (매개변수) -> {구현부}
		 * - 익명 객체가 구현한 추상 메소드를 표현하는 표현식
		 * - 인터페이스 참조변수 = (매개변수) -> {구현부}
		 * - 참조변수.추상메소드();
		 * 
		 * 함수형 인터페이스
		 * -표준 API 함수형 인터페이스(내장형)
		 * 1. Consumer
		 * 		-(매개변수) -> {구현부}
		 * 2. Supplier
		 * 		-() -> {return 반환값}
		 * 3. Function
		 * 		-(매개변수) -> {return 반환값}
		 * 4. Operator
		 * 		-(매개변수) -> {return 반환값}
		 * 		- 매개변수와 반환값이 동일한 자료형
		 * 5. Predicate
		 * 		-(매개변수) -> {return 반환값}
		 * 		- 반환값이 Boolean
		 * 
		 * 
		 * 
		 */
		
		//m1();
		m2();
		
	}

	private static void m2() {
		//스트림을 얻어오는 방법
		//- stream() 메소드를 사용
		//1. 배열로부터
		//2. 컬렉션으로부터
		//3. 숫자 범위로부터
		//4. 파일로부터
		//5. 디렉토리로부터
		
		//1.배열
		int[] nums1 = {10,20,30,40,50};
		//nums1.stream();
		Arrays.stream(nums1).forEach((n->System.out.println(n)));
		System.out.println();
		
		//2.컬렉션
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		nums2.stream().forEach(n->System.out.println(n));
		System.out.println();
		
		LinkedList<Integer> nums3 = new LinkedList<Integer>();
		nums3.add(10);
		nums3.add(20);
		nums3.add(30);
		nums3.stream().forEach(n->System.out.println(n));
		System.out.println();
		
		HashSet<Integer> nums4 = new HashSet<Integer>();
		nums4.add(1000);
		nums4.add(2000);
		nums4.add(3000);
		
		nums4.stream().forEach(n->System.out.println(n));
		System.out.println();
		
		//3.숫자범위로부터
		IntStream.range(1,11).forEach(n->System.out.println(n));
		System.out.println();
		
		//4.파일로부터
		try {
			//스트림을 통해 파일 읽기 가능
			Path path = Paths.get("data\\month.txt");
			System.out.println(path.toAbsolutePath());
			Files.lines(path).forEach(line->System.out.println(line));
			System.out.println();
			
			
			//5.디렉토리로 부터
			Path dir = Paths.get("D:\\class");
			Files.list(dir).forEach(p->{
				System.out.println(p.toString());
				System.out.println(p.toFile().getName());
				System.out.println(p.toFile().isFile());
				
				});
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void m1() {

		int[] nums1 = Data.getIntArray();
		//System.out.println(nums1.length);
		//System.out.println(Arrays.toString(nums1));
		
		
		
		
		int[] nums2 = Data.getIntArray(5);
		//System.out.println(nums2.length);
		//System.out.println(Arrays.toString(nums2));
		
		
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3);
		
		List<Integer> nums4 = Data.getIntList(5);
		System.out.println(nums4);
		
		String[] txt1 =Data.getStringArray();
		//System.out.println(Arrays.toString(txt1));
		
		List<String> txt2 =Data.getStringList();
		//System.out.println(txt2);
		
		User[] users1 = Data.getUserArray();
		//System.out.println(Arrays.toString(users1));
		
		List<User> users2 = Data.getUserList();
		//System.out.println(users2);
			
		
		//nums4 -> List<Integer> 길이 5
		System.out.println(nums4);
		
		//배열(컬렉션) 탐색
		//1. for문
//		for(int i=0;i<nums4.size();i++) {
//			System.out.printf("%4d",nums4.get(i));
//		}
//		System.out.println();
		
		//2.향상된 for문
		//-순수배열
		//-List 계열
		//-Set 계열
		for(int num:nums4) {
			System.out.printf("%4d",num);					
		}
		System.out.println();
		
		//3.iterator
		Iterator<Integer> iter = nums4.iterator();
		
		while(iter.hasNext()) {
			System.out.printf("%4d",iter.next());
		}
		System.out.println();
		System.out.println("-------------------------------");
		
		//4.Stream
		//
		Stream<Integer> stream = nums4.stream();
//		
//		//void forEach(Consumer)
//		//-매개변수 타입 Consumer 인터페이스 > Consumer 인터페이스를 상속받은 객체를 매개변수로 요구 > 실명 클래스 객체 or 익명 클래스 객체
//		//forEach가 하는일
//		//1. stream을 얻어낸 데이터 소스(nums4)로부터 요소를 하나씩 가져온다. > 탐색
//		//2. 1번에서 가져온 요소 > Consumer에게 전달
//						// > accept(1번에서 가져온 요소)
//		stream.forEach(new AAA());
//		System.out.println();
		
		//4.2 익명클래스
		stream = nums4.stream();
		stream.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.printf("%4d",t);
				
			}
			
		});
		System.out.println();
		
		//4.3람다식
		stream = nums4.stream();
		stream.forEach(t-> System.out.printf("%4d",t));
		System.out.println();
		System.out.println("------------------------------");
		
		
		txt2.stream().forEach(word->System.out.println(word));
		
		txt2.stream().forEach(word->{
			System.out.print(word+">");
			if(word.length()>3) {
				System.out.println("긴단어");
			}else {
				System.out.println("짧은단어");
			}
		});
		
		System.out.println();
		
		//전형적인 함수형 프로그래밍 방식
		// -> 함수.함수.함수.....
		users2.stream().forEach(user->System.out.println(user.getName()));
		System.out.println();
		
		users2.stream().forEach(user->{
			System.out.println("[회원정보]");
			System.out.println("이름: "+user.getName());
			System.out.println("이름: "+user.getAge());
			System.out.println("이름: "+(user.getGender()==1?"남자":"여자"));
		});
		
		Data.getItemList().stream().forEach(item-> {
			System.out.println(item.getName());
			System.out.println(item.getSize());
			System.out.println(item.getColor());
			System.out.printf("%tF\r\n",item.getDate());
			System.out.println();
		});
		
		
	}
}

//class AAA implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println("테스트-"+t);
//		
//	}
//	
//}