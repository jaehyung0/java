package com.test.question.collection;

public class MyQueue {

	private String[] list;
	private int index;
	
	public MyQueue() {
		
		this.list = new String[4];
		this.index = 0;
	}
	
	public void trimToSize() {
		
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

//	public boolean contains(String s) {
//
//		for(int i=0; i<this.index; i++) {
//			if(this.list[i].equals(s)) {
//				return true;
//			}
//		}
//		return false;
//	}

	public String peek() {
		String temp = this.list[0]; //읽기
		
		return temp;
	}

	public String poll() {
		
		
		String temp = this.list[0]; //읽기
		for(int i=0;i<this.index-1;i++) {
			this.list[i]=this.list[i+1];
		}
		this.index--; //삭제 겸용
		
		return temp;
	}

	public int size() {
		
		return this.index;
	}

	public void add(String s) {
		
		
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
