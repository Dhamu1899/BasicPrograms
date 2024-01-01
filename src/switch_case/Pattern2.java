package switch_case;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter The number : ");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
				
s.close();

	}

}
