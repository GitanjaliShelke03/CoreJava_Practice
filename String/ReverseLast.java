public class ReverseLast{
 public static void main(String[] args){

 String s = "Hello dlorw";

 String[] words = s.split("\\s+");

  for(int i = words.length-1; i>=0; i--){
 System.out.print(words[i] +" ");
  }
 }
}