package looping;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		int n,r,sum=0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Number =");
		n=s.nextInt();
		while(n>0) {
			r=n%10;
		sum=sum+r;
			n=n/10;
		}
			
		System.out.println("sum ="+sum);
		s.close();

	}
	
}

