class MoveZerosToRight{

 public static void main (String args[]){
	 
  String s = "12234000708090";
  int counter =0;
   String res ="";
   
  for(int i=0;i<s.length();i++){
	  
  if(s.charAt(i)=='0')
     counter++;
  
  else
	res += s.charAt(i);
  
   }
  System.out.print(res);
  for(int c=0;c<=counter;c++){
	   System.out.print('0');
    }
	
	
	
	/*Optimized Version (Using StringBuilder) 
	Because of String + creates new object every time.*/
	System.out.println("\n");
	
	
	
	StringBuilder result = new StringBuilder();
	for(int i=0; i<s.length();i++){
		if(s.charAt(i)=='0'){
			counter++;
		}
		else{
			result.append(s.charAt(i));
		}
	}
	System.out.print("result" +result);
	 for(int c=0; c<=counter; c++){
	   System.out.print('0');
    }
	
  }
 }  
  
