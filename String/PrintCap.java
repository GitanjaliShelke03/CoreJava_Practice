
class PrintCap{
 public static void main(String[] args){
String str = " I Love Maharastra";

		        for(int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);

		            if(ch >= 'A' && ch <= 'Z') {
		                System.out.println(ch);
		            }
		        }
 }
}