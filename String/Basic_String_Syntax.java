public class Basic_String_Syntax{
public static void main(String[] args){

String s = "Hello"; //immutable String, obj crerated in String pool
s.concat("world!"); //creates new obj
System.out.println(s); //s points "Hello"
 }
}