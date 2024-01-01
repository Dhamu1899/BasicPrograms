package Prime_Number;

import java.util.Scanner;

public class Mixed_series {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number to generate the series :");
		int n=s.nextInt();	
		int fact;
		int number = 1;
		for(int i=0;i<n;i++){
			fact=1;
			if(i%2==0) 
			System.out.println(i+" ");

			else {
				for(int j=1;j<number;j++) {
					fact=fact*j;
					
					
				}
				System.out.println(fact+" ");
				number++;
				
			}
			
				
			s.close();
		}
	}

}
