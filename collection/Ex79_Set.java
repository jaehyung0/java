package com.test.java.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex79_Set {

	public static void main(String[] args) {
		
		//Set > HashSet, TreeSet
		
		//TreeSet
		//-Tree 구조를 가지는 Set
		//-중복값x. 순서x, 정렬x
		//-이진 트리 구조 기반의 자동 정렬이 가능한 Set
		
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(100);
		set.add(400);
		set.add(300);
		set.add(500);
		set.add(200);
		set.add(200);
		
		System.out.println(set.size());
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		//TreeSet 특징
		//1.정렬
		//2.부분 검색 용이(***)
		
		TreeSet<Integer> tree = (TreeSet)set;
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.headSet(300));
		System.out.println(tree.tailSet(300));
		
		//List -> ArrayList(*****), LinkedList(***), Vector, Stack(***), Queue
		//Set -> HashSet(***), TreeSet(*)
		//Map -> HashMap(*****)
		
	}
}
