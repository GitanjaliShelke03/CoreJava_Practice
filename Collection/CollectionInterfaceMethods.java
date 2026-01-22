package collection.methods;

import java.util.ArrayList;

public class CollectionInterfaceMethods {
	public static void main(String[] args) {
	
	ArrayList al = new ArrayList();
	//add
	al.add(1);
	al.add(null);
	al.add(3);
	al.add(2);

      //size()  -->int retung type
	System.out.println(al.size());

	//isEmpty ->boolean return type
	  System.out.println(al.isEmpty());
 
	//contains(Object obj)  ->boolean return type
          System.out.println(al.contains(1));

     //add(Object obj)
        al.add(5);

     //remove(Object obj)
        al.remove(2);   //remove index 2 i.e 3
       System.out.println(al);stem.out.println(al.isEmpty());

	}
}
