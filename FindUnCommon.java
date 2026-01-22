package collection.methods;

import java.util.ArrayList;

public class FindUnCommon {
public static void main(String[] args) {
	int[] arr1 = {1,2,3,4};
	int[] arr2 = {1,2,3,4,5,6,7};
	
	ArrayList a= new ArrayList();
	ArrayList b = new ArrayList();
	
	
	for(int i=0;i<arr1.length;i++) {
		a.add(arr1[i]);
	}
	for(int i=0;i<arr2.length;i++) {
		b.add(arr2[i]);
	}
	
	b.removeAll(a);
	System.out.println(b);
}
}
