public class EvenOddCount{

public static void main(String[] args){
int even= 0;
int odd = 0;
int[] arr = {12,445,78,97,13,55,56,86};

  for(int i = 0; i < arr.length ; i++){ 
	  if(i%2==0){
		even++;
	  }
	 else{
	  odd++;
	 }
  }
	System.out.println("Even nos:" +even);
	System.out.println("Odd nos:" +odd);
}
}