package collection.methods;

import java.util.ArrayList;

public class FindCommonElement {
public static void main(String[] args) {
	int[] arr1= {1,2,3,4};
	int[] arr2= {1,2,3};
	ArrayList a1 = new ArrayList();
	ArrayList a2 = new ArrayList();
	
	for(int i= 0;i<arr1.length;i++) {
		a1.add(arr1[i]);
	}
	for(int i=0;i<arr2.length;i++) {
		a2.add(arr2[i]);
	}
	
	a1.retainAll(a2);
	System.out.println(a1);
}
}
