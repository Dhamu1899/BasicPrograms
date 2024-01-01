package Prime_Number;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Number ;");
		int n=s.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				System.out.println(n+" is not a prime number");
				break;
			}
		}
		if(count==0 && n!=1)
			System.out.println(n+" is a prime number");
		s.close();		

	}

}
