 import java.util.Scanner;
 
 public class PrimeNum{
	 public static void main (String[] args){
		 /* Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter number:");
		 int num = sc.nextInt();
		 
		 boolean isPrime = true;
		 for(int i = 2; i<num/2;i++){
			 if(num%i == 0){
				 isPrime = false;
			 }
		 }
		 if(isPrime){
		 System.out.println("number is prime: "+num);
		 }
		 else{
			 System.out.println("number is not prime: "+num);
			  */
			 
			int num;
			//Print Prime numbers from  1 to 100
			
			 System.out.println("Prime numbers:");
			 for(num = 1; num <= 100; num++){
				  boolean isPrime = true;
				 for(int j = 2; j<=num/2;j++){
					 if(num%j ==0){
						 isPrime= false;
						 break;
					 }
				 }
				 if(isPrime){
			System.out.println(+num);
				 }
			 }
			
		 }
	 }
 