package looping;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		int n,r;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Number =");
		n=s.nextInt();
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
			s.close();
		}
		
		

	}

}
