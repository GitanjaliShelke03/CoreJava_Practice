import java.util.Scanner;

public class SquarePattern{
	
public static void main(String args[]){
 
 Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of line to print sqauare:");
  int line = sc.nextInt();
 for(int i=1; i<=line; i++){
    for(int ast=1; ast<=line ;ast++){
	
 System.out.print("* ");
 }
 System.out.println();
  }
 }
}

 