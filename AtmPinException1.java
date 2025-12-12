package Com.ExceptionHandling;
import java.util.Scanner;
public class AtmPinException1 {
	
	public class InvalidPinException extends Exception{
	public InvalidPinException(String msg) {
		super(msg);
	}
	}
	int pin =3455;
	float balance =900000;
	int attempt=1;
	Scanner sc = new Scanner(System.in);
	
	public void withdraw(float ammount) {
		while(attempt<=3) {
			System.out.println("Enter your pin:");
			int userPin=sc.nextInt();
			
			try {
		
		if(pin!=userPin) {
		
			throw new InvalidPinException("Invalid Pin, please try again!");
			
		}
		
		//correct pin then execute this |
		                         
		 balance = balance - ammount;
		 System.out.println("Transaction Successful!");
		 System.out.println("Remaining balance:" +balance);
         break;   // exit loop after success
		
		}catch(InvalidPinException e) {
			
				System.out.println(e);
			    System.out.println("Attempt: " + attempt + "/3");
				//e.printStackTrace();
			    
			    if (attempt == 3) {
			    System.out.println("Your card is Block!");
			}
			 attempt++;
	      }
		}
	}
public static void main(String[] args) {
	AtmPinException1 ap = new AtmPinException1();
	ap.withdraw(3000);
}
}




