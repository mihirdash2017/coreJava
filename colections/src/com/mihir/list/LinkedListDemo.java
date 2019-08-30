package com.mihir.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String a[]){
		LinkedList list=new LinkedList<String>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(4);
		list.addFirst(1);
		System.out.println(list);
	}

}
