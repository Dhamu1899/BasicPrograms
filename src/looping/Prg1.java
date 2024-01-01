package looping;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the num1 :");
		a=s.nextInt();
		System.out.print("Enter the num2 :");
		b=s.nextInt();
		if(a>b)
		{
		c=a;
		System.out.print("a is greater :"+c);
		}
		else 
		{
			c=b;
		System.out.print("b is greater :"+c);
		}
	
		//System.out.println("c ="+c);
		s.close();
		
		
		
	}

}
