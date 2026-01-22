package collection.methods;

import java.util.ArrayList;

public class SetTheoryMethods4 {
public static void main(String[] args) {
	int[] arr1 = {2,3,4};	
	int[] arr2 = {1,2,3,4,5,6,7};
	
	ArrayList a1 = new  ArrayList();
	ArrayList a2 = new ArrayList();
	
	for(int i =0; i<arr1.length; i++) {
		a1.add(arr1[i]);
	}
	
	for(int i=0;i<arr2.length;i++) {
		a2.add(arr2[i]);
	}
	System.out.println("is arr1 is Subset of arr2:"+a2.containsAll(a1));
	System.out.println(" arr1"+a1+" "+"arr2"+a2);
}
}
