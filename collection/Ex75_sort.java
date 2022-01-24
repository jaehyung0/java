package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex75_sort {

	public static void main(String[] args) {
		
		//배열 or 컬렉션
		Integer[] nums = {1,5,2,4,3};
		
		//오름차순 정렬
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//내림차순 정렬
		Arrays.sort(nums, new MyComparator());
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				
				return o2-o1;
			}
			
		});
		
		
		ArrayList<Item> list = new ArrayList<Item>();
		
		list.add(new Item(10,"사과"));
		list.add(new Item(50,"귤"));
		list.add(new Item(20,"포도"));
		list.add(new Item(30,"파인애플"));
		list.add(new Item(40,"딸기"));
		
		System.out.println(list);
		
		//정렬 오름차순
		//Collections.sort(list);
		//System.out.println(list);
		
		list.sort(new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				
				return o1.getNum()-o2.getNum();
			}
			
		});
		System.out.println(list);
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;
	}
	
}


//정렬 -> 비교 -> 인터페이스 상속
//1. Comparator > 외부에서 객체들을 서로 비교하는 역할
//2. Comparable > 객체 스스로가 비교 대상이 되기 위해서

class Item implements Comparable<Item>{
	private int num;
	private String txt;
	
	public Item(int num, String txt) {
		
		this.num = num;
		this.txt = txt;
	}
	
	@Override
	public String toString() {
		return String.format("{num:%d, txt:%s}", this.num,this,txt);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compareTo(Item o) {
//		
//		return this.getNum()-o.getNum();
//	}
	
	
}

