 import java.util.Scanner;
 
 public class ArmStrongNum{
	 
 //An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. eg 153
 
 public static void main(String[] args){
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your number");
	 int num = sc.nextInt(); 
	 int temp = num;
	 int digits =0;
	 
	 while(temp>0){
		 digits++;
		 temp /= 10;  //remove last digit until temp = 0;
	 }
	 
	 int sum = 0;
	 temp=num;
	 while(temp>0){
		int digit = temp % 10; //gives last digit
		 sum += Math.pow(digit,digits);
		 temp/= 10;
	 }
	 if(sum== num){
		 System.out.println(num +" "+ "is ArmStrong number");
	 }else
		 System.out.println(num +" "+ "is not ArmStrong number"); 
 }
 }