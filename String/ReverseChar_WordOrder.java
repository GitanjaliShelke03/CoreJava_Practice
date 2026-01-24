import java.util.Scanner;
public class ReverseCharWordorder{
 public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your String:");
  String s = sc.nextLine();

  String rev = "";
  for(int i =s.length()-1; i>=0 ; i--){ //read string from last index to 1st index
	  rev = rev + s.charAt(i);
  }
  System.out.println(rev);
 }
}


