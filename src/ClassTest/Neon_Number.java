package ClassTest;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=s.nextInt();
		int sum=0,r,temp=0;
		 while (n > 0) {
			 r=n%10;
			 sum=sum+(r*r);
				n=n/10;
		 }
		 if(temp == sum)
				System.out.println("Not a Neon numbe");
			else
				System.out.println("Neon number");
			s.close();
		
		

	}

}
