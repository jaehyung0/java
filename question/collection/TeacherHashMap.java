package com.test.question.collection;

public class TeacherHashMap {
	
	private String[] keys;
	private String[] values;
	private int index;
	
	public TeacherHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	
	@Override
	public String toString() {
		
		String temp = "";
		
		temp += "\r\n";
		temp += String.format("length: %d\r\n", this.keys.length);
		temp += String.format("index: %d\r\n", this.index);
		temp += String.format("[\r\n");
		for (int i=0; i<this.keys.length; i++) {
			temp += String.format("  %s: %s,\r\n"
										, this.keys[i]
										, this.values[i]);
		}
		temp += String.format("]\r\n");
		
		return temp;
	}

	public void put(String key, String value) {
		
		if (getIndex(key) == -1) {
			//새로 추가하기
			if (checkLength()) {
				doubleList();
			}
			
			this.keys[this.index] = key;
			this.values[this.index] = value;
			this.index++;
			
		} else {
			//이미 같은 키가 존재하면
			this.values[getIndex(key)] = value;
		}
		
		
	}
	
	private boolean checkLength() {
		
		if (this.index == this.keys.length) {
			return true;
		}
		
		return false;
	}

	private void doubleList() {
		
		String[] temp = new String[this.keys.length * 2];
		
		for (int i=0; i<this.keys.length; i++) {
			temp[i] = this.keys[i];
		}
		
		this.keys = temp;			
		
		
		
		String[] temp2 = new String[this.values.length * 2];
		
		for (int i=0; i<this.values.length; i++) {
			temp2[i] = this.values[i];
		}
		
		this.values = temp2;	
	}

	public String get(String key) {
		
		//해당 key가 몇번째 방? > 동일한 방의 value 반환
		
		int index = getIndex(key);
		
		if (index != -1) {
			return this.values[index];
		} else {
			return null;
		}
		
	}

	private int getIndex(String key) {
		
		for (int i=0; i<this.index; i++) {
			if (this.keys[i].equals(key)) {
				return i; 
			}
		}
		
		return -1;
	}

	public int size() {
		
		return this.index;
	}

	public void remove(String key) {
		
		int index = getIndex(key);
		
		if (index > -1) {
			
			for (int i=index; i<=this.keys.length-2; i++) {
				this.keys[i] = this.keys[i+1];
			}
			
			for (int i=index; i<=this.values.length-2; i++) {
				this.values[i] = this.values[i+1];
			}

			this.index--;			
		}
	}

	public boolean containsKey(String key) {
	
		if (getIndex(key) > -1) {
			return true;
		}
		
		return false;
	}

	public boolean containsValue(String value) {

		for (int i=0; i<this.index; i++) {
			if (this.values[i].equals(value)) {
				return true; 
			}
		}
		
		return false;
	}

	public void clear() {
		
		this.index = 0;
	}
}






