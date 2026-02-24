import java.util.HashSet;

public class FindDuplicateChar{

public static void main(String args[]){
	String s = "programming";
	for(int i= 0; i<s.length(); i++){
		for(int j=i+1; j<s.length(); j++){
		
	    if(s.charAt(i)==s.charAt(j)){
		  System.out.println(s.charAt(i));
		}
		}
	}
	
	
	/*Optimized Version (Using HashSet)*/
	 System.out.println("\n");
	
	
	HashSet<Character> seen = new HashSet<>();
	HashSet<Character> duplicate = new HashSet<>();
	
	for(int i=0; i<s.length(); i++){
		char ch = s.charAt(i);
		if(seen.contains(ch)){
			duplicate.add(ch);
		}
		else{
			seen.add(ch);
		}
	}
	 System.out.println(duplicate);
}
}