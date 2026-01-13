package Com.Patterns;

import java.util.Iterator;

public class Solve25_Patterns {
  public static void main(String[] args) {
	
	  System.out.println("Square fill pattern");
	  
	  for(int i = 0; i <= 5; i++) {
		  for(int j = 0; j<=5; j++) {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
	   
	 System.out.println("Right half Pyramid"); 
	 
	  for(int i = 0; i <= 5; i++) {
		  for(int j = 0; j <= i; j++) {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
	  
	  System.out.println("Reverse right half pyramid");
	  
	  for(int i = 0; i<=5; i++) {
		  for(int j=5; j>=i; j--) {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
	  
	  System.out.println("left half pyramid");
	  
	  for(int i = 0; i<=5; i++) {
		  for(int s = 4; s>=i; s--) {
			  System.out.print(" ");
		  }
		  for(int j=1 ;j<=i; j++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
	 System.out.println("Reverse left half pyramid");
	 for(int i = 0; i<=5;i++) {
		 for(int j=0; j<=i; j++) {
			 System.out.print(" ");
		 }
		for(int k = 5; k>=i; k--) {
			System.out.print("*");
		}
		System.out.println();
	 }
	 
	 System.out.println("Number increasing pyeamid");
	 
	 for(int i=1; i<=4;i++) {
		 for(int s=3 ;s>=i ;s-- ) {
			 System.out.print(" ");
		 }
		 for(int j=1;j<=i;j++) {
			 System.out.print(i +" ");
		 }
		 System.out.println();
	 }
	 
	  
	 System.out.println("number triangular");
	 for(int i=1 ;i<=4 ;i++) {
		for(int j =1; j<=i; j++) {
			System.out.print(j +" ");
		}
		System.out.println();
     }
  }
}
