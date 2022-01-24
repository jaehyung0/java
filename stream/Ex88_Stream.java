package com.test.java.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;

import com.test.data.Color;
import com.test.data.Data;



public class Ex88_Stream {
	
	private static List<Student> list;
	
	static {
		list = new ArrayList<Student>();
	}
	

	public static void main(String[] args) {
		
		//번호,이름,키,뭄무게,국어,영어,수학
		
		//스트림 + 배열,컬렉션
		
		//파일 -> 복사 -> 컬렉션 -> 조작
		//1.텍스트 파일의 1줄을 담을 클래스를 만든다.
		
		load();
		
		//Java Stream
		//- 데이터 소스 -> 스트림 -> 조작
		
		
		//파이프 라인, Pipe Line
		//- 스트림을 처리하는 역할
		//- 스트림으로부터 여러개의 파이프를 연결해서 개발자가 원하는 데이터 조작]
		//1. 중간처리(Intermediate Operation)
		//	-필터링,매핑, 정렬, 그룸핑,peek 등 
		//2. 최종처리(Terminal Operation)
		//	-합계, 평균, 카운팅, 최소, 최대, forEach 등
		
		//list.stream().forEach(s -> System.out.println(s.getName()));
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		
	}

	private static void m11() {
		//중간확인
		//-peek()
		//-중간 처리 파이트
		
		list.stream().filter(s->s.getHeight()>=175).peek(s->System.out.println("@"+s.getName()))
		.filter(s->s.getWeight()>=80)
		.filter(s->s.getKor()>=90).forEach(s->System.out.println(s.getName()));
		
	}

	private static void m10() {
		//sum(),avg()
		
		int[] nums1 = {1,2,3,4,5};
		List<Integer> nums2 = Arrays.asList(1,2,3,4,5);
		
		System.out.println(Arrays.stream(nums1).sum());
		System.out.println(Arrays.stream(nums1).average());
		
		//mapToInt(): Stream<T> -> IntStream
		System.out.println(nums2.stream().mapToInt(num->num).sum());
		System.out.println(nums2.stream().mapToInt(num->num).average());
		
		
		//List<Student> list
		System.out.println(list.stream().mapToDouble(s->(s.getEng()+s.getMath()+s.getKor())/3.0).average().getAsDouble());
		
	}

	private static void m9() {
		//min(), max()
		int[] nums1 = {1,2,3,4,5};
		List<Integer> nums2 = Arrays.asList(1,2,3,4,5);
		
		//일반
		int max =1;  //배열에서 가장 작은값
		int min =5;  //배열에서 가장 큰값
				
		for(int i=0;i<nums1.length;i++) {
			if(nums1[i]>max) {
				max=nums1[i];
			if(nums1[i]<min)	
				min=nums1[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		System.out.println(Collections.max(nums2));
		System.out.println(Collections.min(nums2));
		System.out.println();
		//stream().max()
		//stream().min()
		
		//OptionalInt
		//-null값도 가질 수 있는 int
		System.out.println(Arrays.stream(nums1).max());
		System.out.println(Arrays.stream(nums1).min());
		System.out.println(Arrays.stream(nums1).max().getAsInt());
		System.out.println(Arrays.stream(nums1).min().getAsInt());
		
		
		OptionalInt num = OptionalInt.of(10);
		System.out.println(num);
		
		//int num2 =null;
		OptionalInt num2 = OptionalInt.empty();
		System.out.println(num2);
	
		
	}

	private static void m8() {
		//Reduce or 집계
		//- count(), min() ,max(),sum(),avg()
		//- 최종 처리 파일
		//- 요소들을 가공해서 축소하는 작업, 통계값 처리
		//a. long count(): 스트림의 요소의 개수
		
		System.out.println(Data.getIntList().stream().count());
		
		System.out.println(Data.getUserList().stream().count());
		
		System.out.println(Data.getUserList().stream().filter(user->user.getGender()==1).count());
		
		System.out.println(list.stream().filter(s->s.getHeight()>=170).count());
		
		System.out.println(list.stream().filter(s->(s.getKor()+s.getEng()+s.getMath())>=270).count());
		
		System.out.println(Data.getItemList().stream().filter(item->item.getColor()==Color.BLACK).count());
		System.out.println(Data.getItemList().stream().filter(item->item.getColor()==Color.YELLOW).count());
		System.out.println(Data.getItemList().stream().filter(item->item.getColor()==Color.BLUE).count());
		System.out.println(Data.getItemList().stream().filter(item->item.getColor()==Color.RED).count());
		
		
	}

	private static void m7() {
		//최종 처리 파이프(매칭)
		//-스트림의 요소들이 조건을 만족하는지 검사
		//a. boolean allMatch(Predicate) : 모든 요소가 100% 조건을 만족하는지
		//b. boolean anyMatch(Predicate) : 일부 요소가 조건을 만족하는
		//c. boolean noneMatch(Predicate) : 모든 요소가 조건을 불만족하는지
		
		List<Integer> nums = Arrays.asList(2,4,7,8,10);
		System.out.println(nums);
		
		//요구사항) nums안에는 짝수만 들었는지 검사
		boolean result = false;
		
		for(int num:nums) {
			if(num%2==1) {
				result = true;
				break;
			}
		}
		
		if(result) {
			System.out.println("홀수 발견");
		}else {
			System.out.println("모두 짝수");
		}
		
	
		//allMatch
		if(nums.stream().allMatch(num->num%2==0)) {
			System.out.println("모두짝수");
		}else {
			System.out.println("홀수 발견");
		}
		
		//anyMatch
		if(nums.stream().anyMatch(num->num%2==0)) {
			System.out.println("짝수발견");  
		}else {
			System.out.println("모두홀수");
		}
		
		//noneMatch
		if(nums.stream().noneMatch(num->num%2==0)) {
			System.out.println("모두홀수"); //전체가 짝수가 아닐때
		}else {
			System.out.println("짝수발견");
		}
	}

	private static void m6() {
		//정렬
		//--sorted
		//-중간처리 파이프
		//-스트림내의 요소 정렬
		//-배열, 컬렉션의 sort()와 동일
		
		List<Integer> nums = Data.getIntList(10);
		System.out.println(nums);
		
//		Collections.sort(nums);
//		nums.sort(null);
		
		nums.sort((n1,n2)->n1-n2);
		System.out.println(nums);
		
		nums.sort(Comparator.naturalOrder());
		System.out.println(nums);
		nums.sort(Comparator.reverseOrder());
		System.out.println(nums);
		
		nums.stream().forEach(num->System.out.println(num));
		System.out.println();
		
		nums=Data.getIntList(10);
		
		nums.stream().sorted().forEach(num->System.out.println(num));
		System.out.println();
		
		nums.stream().sorted((n1,n2)->n2-n1).forEach(num->System.out.println(num));
		
		list.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).forEach(s->System.out.println(s.getName()));
		System.out.println();
		
		Data.getIntList().stream().filter(num->num%2==0).distinct().sorted().forEach(num->System.out.printf("%4d\n",num));
		System.out.println();
		

	}

	private static void m5() {
		//데이터 소스 -> 스트림 -> 중간 처리 파이프(필터, 변형, 중복값) -> 최종 처리 파이프(반복처리)
		
		//student.txt -> List<Student> list
		list.stream()
		.filter(s->s.getHeight()>=170)
		.filter(s->s.getKor()>=80)
		.map(s->s.getName())
		.distinct()
		.forEach(s->System.out.println(s));
		
		
	}

	private static void m4() {
		//매핑
		//-map(), mapXXX()
		//-중간 처리 파이프
		//-앞의 스트림을 새로운 형태로 변환하는 역할
		
		Data.getStringList(10).stream().forEach(word->System.out.println(word));
		System.out.println();
		
		Data.getStringList(10).stream().map(word->10).forEach(num->System.out.println(num));
		System.out.println();
		
		Data.getStringList(10).stream().map(word->word.length()).forEach(num->System.out.println(num));
		System.out.println();
		
		Data.getStringList(10).stream().map(word->word.substring(0,2)).forEach(num->System.out.println(num));
		System.out.println();
		
		list.stream().map(s->(s.getKor()+s.getEng()+s.getMath())/3.0)
		.filter(avg->avg>=90.0)
		.forEach(avg->System.out.println(avg));
		System.out.println();
		
		list.stream().filter(s->((s.getKor()+s.getEng()+s.getMath())/3.0)>=90)
		.map(s->s.getName())
		.forEach(name->System.out.println(name));
		System.out.println();
		
		
		//10개를 Cup의 size로 사용해서 Cup 10개를 만들어주세요
		Data.getIntList(10).forEach(num->System.out.println(num));
		System.out.println();
		
		Data.getIntList(10).stream().map(n->new Cup(Cup.BLACK,n)).forEach(n->System.out.println(n));
		System.out.println();
		
		Data.getItemList().stream()
		.filter(item -> item.getDate().get(Calendar.DAY_OF_WEEK)==7)
		.map(item -> item.getName())
		.distinct()
		.forEach(name->System.out.println(name));
		//.forEach(item -> System.out.println(item));
		
		
	}

	private static void m3() {
		List<Cup> list = new ArrayList<Cup>();
		
		list.add(new Cup(Cup.BLACK,350));
		list.add(new Cup(Cup.WHITE,350));
		list.add(new Cup(Cup.RED,250));
		list.add(new Cup(Cup.YELLOW,500));
		list.add(new Cup(Cup.BLUE,350));
		list.add(new Cup(Cup.YELLOW,500));
		list.add(new Cup(Cup.YELLOW,350));
		list.add(new Cup(Cup.BLUE,700));
		list.add(new Cup(Cup.BLACK,350));
		
		list.stream().forEach(cup->System.out.println(cup));
		System.out.println();
		
		list.stream()
		//.filter(cup->cup.getColor()==Cup.YELLOW)
		//.filter(cup->cup.getSize()>=500)
		.distinct()
		.forEach(cup->System.out.println(cup));
		
	}

	private static void m2() {
		//-distinct()
				//-중간처리 파이프
				//-앞의 스트림의 데이터 중 중복값을 배제하는 역할
				
				//b. 두번째 방법
				Set<Integer> set2 = new HashSet<Integer>(Data.getIntList());
				System.out.println(set2.size());
				
				
				//c. 세번째 방법
				//-stream() + distinct()
						
				System.out.println(Data.getIntList().stream().count()); //100
				System.out.println(Data.getIntList().stream().distinct().count());
				
				//String[] names = {"홍길동","아무개","하하하","호호호","후후후"};
				List<String> names = Arrays.asList("홍길동","아무개","하하하","호호호","후후후","홍길동");
				names.stream().distinct().forEach(name->System.out.println(name));
				System.out.println();
		
	}

	private static void m1() {
		
		//필터링
		//- filter()
		//- 중간처리 파이프
		//- 조건에 맞는 데이터를 찾기 위한 역할
		//- 조건에 맞는 요소만을 남기고 불만족하는 요소들을 버린다.
		
		List<Integer> nums = Data.getIntList(20);
		System.out.println(nums);
		
		//nums.stream().filter(num -> num >10 ? true : false).forEach(num -> System.out.println(num));
		//nums.stream().filter(num -> num %2==0 ? true : false).forEach(num -> System.out.println(num));
		
		list.stream().filter(s->{
			int total = s.getKor()+s.getEng()+s.getMath();
			return total >=270 ? true : false;
		}).forEach(s->{
			System.out.println(s.getName());
			System.out.println(s.getKor());
			System.out.println(s.getEng());
			System.out.println(s.getMath());
		});
		
		Data.getUserList().stream().filter(user->user.getGender()==2)
		.forEach(user->System.out.println(user));
		System.out.println();
		
		Data.getUserList()
		.stream()
		.filter(user->user.getHeight()>=170&&user.getWeight()<=75)
		.forEach(user ->System.out.println(user));
		System.out.println();
		
		Data.getUserList()
		.stream().filter(user->user.getHeight()>=170)
		.filter(user->user.getWeight()<=75)
		.forEach(user->System.out.println(user));
		System.out.println();
		
		Data.getIntList()
		.stream()
		.filter(num->num>50)
		.filter(num->num%2==0)
		.forEach(num->System.out.println(num));
		
		System.out.println(Data.getIntList().size());
		
	}

	private static void load() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(".\\student.txt"));
			
			String line = null;
			while((line=reader.readLine())!=null) {
				String[] temp = line.split(",");
				Student s = new Student();
				
				s.setSeq(temp[0]);
				s.setName(temp[1]);
				s.setHeight(Integer.parseInt(temp[2]));
				s.setWeight(Integer.parseInt(temp[3]));
				s.setKor(Integer.parseInt(temp[4]));
				s.setEng(Integer.parseInt(temp[5]));
				s.setMath(Integer.parseInt(temp[6]));
				
				list.add(s);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


class Student {
	//번호,이름,키,뭄무게,국어,영어,수학
	
	private String seq;
	private String name;
	private int height;
	private int weight;
	private int kor;
	private int eng;
	private int math;

	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

}


class Cup {
	
	public static final int BLACK =1;
	public static final int WHITE =2;
	public static final int RED =3;
	public static final int YELLOW =4;
	public static final int BLUE =5;
	

	private int color;
	private int size;
	public Cup(int color, int size) {
		
		this.color = color;
		this.size = size;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return String.format("[color=%s, size=%s]", color, size);
	}
	
	//객체 비교
	//1. hashCode() 재정의
	//2. equals() 재정의
	
	@Override
	public int hashCode() {
		//비교하려는 상태값이 동일하면 > 똑같은 해시코드값을 반환하게 재정의
		return (""+this.color+this.size).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.hashCode()==obj.hashCode();
	}
	
}
