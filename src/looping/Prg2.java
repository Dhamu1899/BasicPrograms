package looping;

import java.util.Scanner;

public class Prg2 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the num1 :");
		a=s.nextInt();
		System.out.print("Enter the num2 :");
		b=s.nextInt();
		System.out.print("Enter the num3 :");
		c=s.nextInt();
		if(a>b && a>c)
		System.out.print(" a is greater :"+a);
		else if(b>c) 
		System.out.print("b is greater :"+b);
		else 
			System.out.print(" c is greater :"+c);
		s.close();

	}

}
