package com.test.question.collection;

public class MyArrayList {

	//ArrayList 클래스와 동일한 클래스를 구현하시오
	
	private String[] list;
	private int index1; //데이터를 넣을 현재 방번호
	
	
	public MyArrayList() {
		
		this.list = new String[4];
		this.index1 = 0;
		
		
	}
	
	

	public void add(String s) {
		//System.out.println(this.list.length);
		if(this.list[this.list.length-1]!=null) {
			String[] temp = new String[this.list.length*2]; //8칸짜리
			for (int i=0;i<this.list.length;i++) {
				temp[i]=this.list[i];
			}
			this.list=temp;
		}
		
		this.list[this.index1]=s;
		this.index1++;
	}
	
	public String get(int index) {
		if (!checkIndex(index)) {
			//유효하지 않으면 에러발생
			throw new IndexOutOfBoundsException();
		}
			return this.list[index];
		
			
	}
	
	private boolean checkIndex(int index) {
		//유효한 index 범위?
		//0~index1-1
		if(index >=0 && index < this.index1) {
			return true;
		}
		return false;
	}



	public int size() {
				//System.out.println(this.list.length-1);
//		if(this.list==null) {
//			return 0;
//		}
		return this.index1;
	}
	
	public void set(int index,String value) {
		if (!checkIndex(index)) {
			//유효하지 않으면 에러발생
			throw new IndexOutOfBoundsException();
		}
		this.list[index]=value;
	}
	
	public void remove(int index) {
		//System.out.println(this.list.length-1);
		
		for(int i=index;i<this.list.length-1;i++) {
			this.list[i]=this.list[i+1];
		}	
		this.index1--;
	}
	
	public void add(int index,String value) {
		
		if(this.list[this.list.length-1]!=null) {
			String[] temp = new String[this.list.length*2]; //8칸짜리
			for (int i=0;i<this.list.length;i++) {
				temp[i]=this.list[i];
			}
			this.list=temp;
		}
		
		for(int i=list.length-1;i>=index+1;i--) {
			this.list[i]=this.list[i-1];
		}
		this.list[index]=value;
		this.index1++;
	}
	
	public int indexOf(String value) {
		
		for(int i=0;i<this.index1;i++) {
			if(this.list[i].equals(value)) {
				return 0;
			}
		}
		return -1;
	}
	
	public void clear() {
		//1.
//		this.list=null;
//		this.index1=0;
		
		//2.
		//this.list = new String[4];
		//this.index1=0;
		
		//3.
		this.index1=0;
		
		
	}
	
	@Override
	public String toString() {

		String temp ="";
		
		temp+="\r\n";
		temp+=String.format("length: %d\r\n", this.list.length);
		temp+=String.format("index: %d\r\n",this.index1);
		temp+=String.format("[\r\n");
		for(int i=0;i<this.list.length;i++) {
			temp+=String.format(" %d: %s,\r\n",i,this.list[i]);
		}
		
		temp+=String.format("]\n");
		
		
		return temp;
	}
	
	
	
}
