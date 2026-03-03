class SecondMax{
public static void main(String [] args){
 int[] arr = {12,3,33,9,68};
 
 int secMax =arr[0];
 int max = arr[0];
 
 for(int i =0 ;i<arr.length; i++){
   if(arr[i]>max){
     secMax = max;
     max= arr[i];
   }
  else if(arr[i]>secMax && arr[i]!=max){
	 secMax=arr[i];
   }
 
 }
 System.out.println(secMax);
 
 System.out.println(max);
}
}