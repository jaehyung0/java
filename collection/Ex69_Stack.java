package com.test.java.collection;

public class Ex69_Stack {

	public static void main(String[] args) {
		
		//MyStack
		MyStack stack = new MyStack();
		System.out.println(stack);
		
		stack.push("홍길동");
		System.out.println(stack);
		
		stack.push("아무개");
		stack.push("테스트");
		System.out.println(stack);
		
		System.out.println("size: "+stack.size());
		
		//get() + remove() = pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("size: "+stack.size());
		
		System.out.println(stack);
		
		stack.push("관리자");
//		stack.peek();
		System.out.println(stack.peek());
//		stack.contains();
		System.out.println(stack.contains("관리자"));
		System.out.println(stack.contains("아무개"));
		
		stack.clear();
		System.out.println(stack.clear());
		
		stack.push("홍길동");
		System.out.println(stack);
		
		//더 이상 stack에 데이터를 추가할 일이 없다 > 확신하면 > 길이 줄이기
		
		stack.trimToSize();
		System.out.println(stack);
		
		
		
	}//main
	
}

class MyStack {
	
	//후입선출
	private String[] list;
	private int index;
	
	public MyStack() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public void trimToSize() {
		//확장 로직의 반대
		
		//실제 데이터가 들어있는만큼의 길이를 가지는 배열
		String[] temp = new String[this.index];
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=this.list[i];
		}
		
		this.list =  temp;
		
	}

	public int clear() {
		this.index=0;
		return this.index;
	}

	public boolean contains(String s) {

		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(s)) {
				return true;
			}
		}
		return false;
	}

	public String peek() {
		String temp = this.list[this.index-1]; //읽기
		
		return temp;
	}

	public String pop() {
		
		//읽기 + 삭제
		//this.index-1 > 마지막에 넣은 데이터의 방 번호
		String temp = this.list[this.index-1]; //읽기
	//	this.list[this.index-1]=null;//삭제 굳이 안해도됨
		this.index--; //삭제 겸용
		
		return temp;
	}

	public int size() {
		
		return this.index;
	}

	public void push(String s) {
		//ArrayList 의 add() 메소드랑 똑같다.
		
		//1. 공간 체크
		//2. 요소 추가
		
		if(this.index == this.list.length) {
			String[] temp = new String[this.list.length*2];
			for(int i=0; i<this.index;i++) {
				temp[i]=this.list[i];
			}
			this.list=temp;
		}
		
		this.list[this.index]=s;
		this.index++;
		
		
		
	}

	@Override
	public String toString() {
		String temp="";
		temp+="length: "+this.list.length+"\r\n";
		temp+="index : "+this.index+"\r\n";
		temp+="[\r\n";
		for(int i=0; i<this.list.length;i++) {
			temp+="  "+i+":"+this.list[i]+"\r\n";
		}
		temp+="]";	
		
		temp+="";
		
		return temp;
	}
	
	
}
