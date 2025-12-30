import java.util.Scanner;
public class Palindrome{
 public static void main(String[] args){
	 
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your number:");
	int num = sc.nextInt();
	int OriginalNum = num; 
	int rev = 0;
	
	while(num>0){                                //121>0 12>0 1>0 
		
		int digit = num % 10;   //get last digit //1  2  1
		rev = rev *10 + digit;                   //1  10+2 =12  120+1 = 121
		num = num / 10;         //remove last     //12 1  1/10 0
	}
	
	if(OriginalNum == rev){
		System.out.println(OriginalNum +":is palindrome");
	}
	else{
	System.out.println(OriginalNum +":is not palindrome");
	}
 }
}