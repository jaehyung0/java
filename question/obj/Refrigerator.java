package com.test.question.obj;

public class Refrigerator {

	private Item[] items = new Item[100];

	public void add(Item item) {
		
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
				
				return;
				
			}
		}
		System.out.println();
		System.out.println("빈곳이 없음");
			 
			 
		 
	}
	
	public Item get(String name) {
		System.out.println();
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null && items[i].getName().equals(name))
					return items[i];
		}
		
		System.out.println("없어요~");
		System.out.println();
		return new Item();
		
	}

	public int count() {
		int c=0;
		for(int i=0;i<items.length;i++) {
			if(items[i]!=null) {
				c++;
			}else
				break;
		}
		return c;
	}

	public void listItem() {
		System.out.println();
		System.out.println("[냉장고 아이템 목록]");
		for(int i=0;i<items.length;i++) {
			if(items[i]!=null) {
				System.out.printf("%s(%s)\n",items[i].getName(),items[i].getExpiration());
			}
			
		}
		
	}
}
