package com.collection;

import java.util.ArrayList;

public class TestArrayList {
public static void main(String[] args) {
	ArrayList al = new ArrayList();  //10 initial Capacity
	al.add(11);
	al.add("hii");
	al.add('a');
	al.add(9.8866f);
	al.add(8.5);
	//System.out.println(al.get(0));
	
	System.out.println(al.remove(3));
	System.out.println(al.get(3));
	System.out.println("ArrayList:" +al);
}
}
