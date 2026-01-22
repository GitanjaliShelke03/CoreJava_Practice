
public class PrintNumOfString {
	public static void main(String[] args) {
		String s = "git2nj2l8";	
		
		for(int i=0;i<s.length();i++) {
			if(s.valueOf(s.charAt(i)).matches("\\d")) {
				System.out.println(s.charAt(i)-'0');
			}
		}
	}

}
