import java.util.Scanner;

public class ReverseWordOrder{
 public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter String");

 String s = sc.nextLine();
 String[] words =  s.split("\\s+");

 for(int i = words.length-1; i>=0; i--){
	 System.out.print(words[i] +" ");
    }
 }
}