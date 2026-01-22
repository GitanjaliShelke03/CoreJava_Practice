package collection.methods;

import java.util.ArrayList;

public class SetTheoryMethods2 {
public static void main(String[] args) {
	ArrayList al1 = new ArrayList();
	al1.add(1);
	al1.add(2);
	al1.add(3);
	al1.add(4);
	
	
	ArrayList al2 = new ArrayList();
	al2.add(1);
	al2.add(2);
	al2.add("A");
	al2.add("B");
	
	al2.removeAll(al1);  //difference ..removes similar elements 
	System.out.println(al2);
}
}
