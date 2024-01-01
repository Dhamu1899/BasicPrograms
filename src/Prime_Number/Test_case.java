package Prime_Number;

import java.util.Scanner;

public class Test_case {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Minimum Value :");
		int min=s.nextInt();
		System.out.print("Enter the Maximum Value :");
		int max=s.nextInt();
		System.out.print("prime numbers are :");
		
	
		for(int n=min;n<=max;n++){
			int count=0;
			for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0 && n!=1)
			System.out.println(n+" ");
		s.close();		

	}
			
			
		}
}
		
		
		
		
		
		

	
