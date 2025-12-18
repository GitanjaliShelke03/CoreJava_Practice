public class SearchArrayElement{
public static void main(String args[]){
	int[] arr = {4,9,16,25,36,49,64,81,100,121,144,196};
	
	boolean numFound = false;
	int num = 121;
	
	for(int i=0;i<=arr.length-1;i++){
		if(arr[i]==num){
			numFound =true;
		}
	}
	if(numFound){
		System.out.println("Your number Found:"+num);
	}
	else{
		System.out.println("Not found"+num);
	}
  }
}