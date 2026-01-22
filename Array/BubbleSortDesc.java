public class BubbleSortDesc{
public static void main(String[] args){

int[] arr = {45,6,77,2,34,55,99};
for(int i =0; i<arr.length;i++){ //to read array elements
	for(int j =0; j<arr.length-1-i;j++){ //to compare each element & swipe large to left index
	 if(arr[j+1] > arr[j]){ 
	     int temp = arr[j];
	     arr[j] = arr[j+1];
         arr[j+1] = temp;
	}
	}
}
	System.out.println("Descending ordered Array");
	 for(int i =0; i<arr.length ;i++){
		 System.out.println(" "+arr[i]);
	 }
}
}



