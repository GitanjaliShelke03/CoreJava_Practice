import java.util.Scanner;

public class HollowTriangle{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x =sc.nextInt();

	for(int i=1;i<=x;i++) {
		for(int s=x;s>=i;s--) {
			System.out.print(" ");
		}
		for(int k = 1;k<=2*i-1;k++ ) {
			if(k==1 || k==(2*i)-1|| i==x) {
				System.out.print("*");
		}else
			System.out.print(" ");
		}
		System.out.println();
     }
}
}
