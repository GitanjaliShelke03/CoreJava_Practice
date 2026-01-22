  import java.util.Scanner;
  public class SumOfArray{
   public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 System.out.println("Enter Size of Array:");
  int n = sc.nextInt();

 int[] arr = new int[n];

 System.out.println("Enter Array Element:");
  for(int i=0; i<arr.length; i++){
	arr[i]=sc.nextInt();   //store elements given by user
   }

  System.out.println("Array given by you:");
    for(int i=0; i<arr.length; i++){
	 System.out.print(arr[i]+", ");
    }

  System.out.println("Sum of Array Elements:");
 int sum = 0;
   for(int i= 0; i<arr.length ; i++){
	 sum = sum + arr[i];
    }
   System.out.println(sum);
  }
}
	

