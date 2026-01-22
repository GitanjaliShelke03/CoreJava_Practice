package collection.methods;

import java.util.ArrayList;

public class SetTheoryMethods3 {
	public static void main(String[] args) {
		
ArrayList a = new ArrayList();
 a.add(1);
 a.add(2);
 a.add("a");
 a.add("b");
 
 
 ArrayList b = new ArrayList();
 b.add("a");
 b.add("b");
 b.add("c");
 b.add("d");
 
 a.retainAll(b);
 System.out.println(a);  //(common elements will print)intersection ..delete uncommon elements 
	}
}
