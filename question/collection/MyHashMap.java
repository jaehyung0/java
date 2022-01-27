package com.test.question.collection;

public class MyHashMap {

	//방번호(숫자), 값(문자)
	private String[] value;
	private String[] keys;
	private int index;
	
	
	
	public MyHashMap() {
		
		this.value = new String[4];
		this.keys = new String[4];
		this.index = 0;
	}



	public void put(String key,String value) {
		
		if(this.value[this.value.length-1]!=null) {
			String[] temp1 = new String[this.value.length*2]; //8칸짜리
			for (int i=0;i<this.value.length;i++) {
				temp1[i]=this.value[i];
			}
			this.value=temp1;
		}
		
		if(this.keys[this.keys.length-1]!=null) {
			String[] temp2 = new String[this.keys.length*2]; //8칸짜리
			for (int i=0;i<this.keys.length;i++) {
				temp2[i]=this.keys[i];
			}
			this.keys=temp2;
		}
		
		//수정 할것을 받아도 뒤에 추가한다음
		//remove에서 다 같이 지워버린다.
		
		int i=0;
		for(i=0;i<keys.length-1;i++) {
			if(key.equals(this.keys[i])) {
				this.value[i]=value;
				break;
			}
			
		}
		
		this.keys[this.index]=key;
		this.value[this.index]=value;
		this.index++;

		
		
	}
	
	public String get(String key) {
		int i=0;
		for(i=0;i<keys.length-1;i++) {
			if(key.equals(this.keys[i])) {
				break;
			}
		}
		return this.value[i];
	
	}

	public int size() {
		return this.index;
	}

	public void set(String key,String value) {
		int i=0;
		for(i=0;i<keys.length-1;i++) {
			if(key.equals(this.keys[i])) {
				break;
			}
		}
		this.value[i]=value;
	}
		
	public void remove(String key) {
		int i=0;
		for(i=0;i<keys.length;i++) {
			if(key.equals(this.keys[i])) {
				this.value[i]=null;
				this.keys[i]=null;
				this.index--;
			}
		}
		
	}
	
	public boolean containKey(String key) {
		
		for(int i=0;i<index;i++) {
			if(key.equals(this.keys[i])) {
				return true;
				}
		}
		return false;
	}
	
	public boolean containsValue(String value) {
		
		for(int i=0;i<index;i++) {
			if(value.equals(this.value[i])) {
				return true;
				}
		}
		return false;
	}

	public void clear() {
		this.index=0;
		
	}
	
	@Override
	public String toString() {
		String temp="";
		temp+=String.format("\n");
				
		for(int i=0;i<index+1;i++) {
			temp+=String.format(" %d: %s:%s,\r\n",i,this.keys[i],this.value[i]);
		}
		
		return temp;
	}
}


