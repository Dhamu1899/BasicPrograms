package switch_case;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		int n;
		char ch;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the number = ");
		n=s.nextInt();
		for(int i=1;i<=n;i++) 
		{
			ch='A';
			for(int j=1;j<=i;j++) 
			{
				System.out.print(ch++);
			
			}
				System.out.println();	

		}
		s.close();
		}
	}
