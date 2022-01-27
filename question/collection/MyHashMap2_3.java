package com.test.question.collection;

public class MyHashMap2_3 {

	private Item[] list;
	private int index;
	
	Item item = new Item();
	Item[] Item;
	
	public MyHashMap2_3() {
		
		this.list = new Item[100];
		this.index=0;
		
	}

	
	
	public void put(String key, String value) {
		Item item = new Item();
			
		
		int i=0;
		for(i=0;i<index;i++) {
			if(key.equals(this.list[i].key)) {
				this.list[i].value=value;
				break;
			}
			
		}
		
		item.key = key;
		item.value = value;	
		this.list[this.index] = item;
		this.index++;
	}
	
	public String get(String key) {
		int i=0;

		for (i=0;i<index+1;i++) {
			if(key.equals(this.list[i].key)) {
				
				break;
			}
		}
		return this.list[i].value;
	}
	
	public int size() {
		return this.index;
	}
	
//	public void set(String key,String value) {
//		int i=0;
//		for(i=0;i<index;i++) {
//			if(key.equals(this.list[i].key)) {
//				
//				break;
//			}
//		}
//		this.list[i].value=value;
//	
//	}
	
	public void remove(String key) {
		int i=0;
		for(i=0;i<index;i++) {
			if(key.equals(this.list[i].key)) {
				this.list[i].value=null;
				this.list[i].key=null;
				this.index--;
				}
		}
		
	}
	
	public boolean containKey(String key) {
		int i=0;
		for(i=0;i<index+1;i++) {
			if(key.equals(this.list[i].key)) {
				return true;
				}
		}
		return false;
	}
	
	public boolean containsValue(String value) {
		int i=0;
		for(i=0;i<index;i++) {
			if(value.equals(this.list[i].value)) {
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
				
		for(int i=0;i<index;i++) {
			temp+=String.format(" %d: %s:%s,\r\n",i,this.list[i].key,this.list[i].value);
		}
		
		return temp;
	}
}