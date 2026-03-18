public class RevNum{
	public static void main(String[] args){
		int a = 1230;
		int rev =0;
		
		while(a>0){
			int digit = a%10;  //4 3 2 1
			rev = rev*10+digit;   //4 43 432 4321 
             a = a/10;        //123 12 1 0
		}
		System.out.println(rev);
	}
}