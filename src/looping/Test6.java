package looping;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		int n,r,reverse=0,temp;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Number =");
		n=s.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
		reverse = reverse*10+r;
			n=n/10;
		}
			
		//System.out.println("reverse ="+reverse);
		
		if (temp==reverse)
			System.out.println("palindrame");
		else
			System.out.println("not a palindrame");
		s.close();

	}

}
