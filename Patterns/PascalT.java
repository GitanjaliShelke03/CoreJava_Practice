public class PascalT{
public static void main(String args[]){
for(int i=1;i<=4; i++){
  for(int space=3; space>=i;space--){
     System.out.print("");
     }
	 if(i%2==0){   //even line---alphabets
	 char c ='a';
   for(int ch =1; ch<=i; ch++){
     System.out.print(c+"");
	 c++;
      }
	 }else{
	//
	  for(int n=1;n<=i;n++){
    System.out.print(n);
    }
	  }
System.out.println();
}
}
}