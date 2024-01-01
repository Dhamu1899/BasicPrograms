package Number_Methods;

import java.util.Scanner;

public class Factorial_Pro {

	public static void main(String[] args) {
		int n,fact=1;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter The Number = ");
		n=s.nextInt();
		for(int i=n;i>0;i--)
		{
		fact=fact * i;
		
	}
System.out.println("factorial ="+fact);
s.close();
}
}
