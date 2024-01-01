package Number_Methods;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		int n ,sum=0,r,temp = 0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter The Number = ");
		n=s.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
			}
		if(temp == sum)
			System.out.println("Amstrong number");
		else
			System.out.println("Not a Amstrong number");
		s.close();
			
		}
	}
	

		

	