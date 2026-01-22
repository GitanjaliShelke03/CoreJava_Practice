public class ReverseLast{
 public static void main(String[] args){

 String s = "Hello dlrow";

 String[] words = s.split("\\s+");

 String lastWord = words[words.length-1]; 

 String rev = "";
 
  for(int i = lastWord.length()-1; i>=0; i--){
  rev +=lastWord.charAt(i);
  }
  
 for (int i = 0; i < words.length - 1; i++) { //print Hello only 
            System.out.print(words[i] + " ");
        }
        System.out.print(rev);     
  }
 }
