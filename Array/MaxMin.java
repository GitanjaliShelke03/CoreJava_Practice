public class MaxMin{
 public static void main(String args[]){
	int[] arr = {20,45,65,24,56,23};
	int max = arr[0];
	int min = arr[0];
	
	for(int i=1;i<arr.length;i++){
		if(arr[i]>max){
			max= arr[i];
		}
		if(arr[i]<min){
			min = arr[i];
		}
		
	}
	System.out.println("max element:"+max);
	System.out.println("Min element:"+min);
 }
}
