 public class ArmStrongNumber{
public static void main(String[] args){
	
	int num = 153;
	int temp = num;
	
	int digits = 0;
	
	while(temp>0){  //153..15..1
		digits++;    //1   2   3
	 	temp /= 10;  //15  1   temp=0  loop end
	}
	 int sum =0 ;
	 while(temp>0){
		 int digit = temp % 10;   //3 5 1
		 sum += Math.pow(digit,digits); //27+125+1=153
		 temp /= 10;      
	 }
	 if(sum== num){
		  System.out.println(original + " is an Armstrong number");
	 } else
	            System.out.println(original + " is NOT an Armstrong number");
	    }
	}
