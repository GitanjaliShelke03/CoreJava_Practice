package collection.methods;
import java.util.ArrayList;
public class SetTheoryMethods1 {
public static void main(String[] args) {
	
	ArrayList al1 = new ArrayList();
	al1.add(11);
	al1.add(12);
	al1.add(13);
	System.out.println(al1);
	
	ArrayList al2 = new ArrayList();
	al2.add("a");
	al2.add("b");
	al2.add("c");
	al2.add("d");
	
	al1.addAll(al2);
	System.out.println(al1);  //Union adding elements of al2 into al1
	System.out.println(al2);
}
}
