package looping;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner (System.in);
		System.out.print("enter the number =");
		n=s.nextInt();
		if (n>0)
		System.out.println("Possitive numbr");
		
		else if (n==0) {
			System.out.println("num is zero");
		}
			
		else {
			System.out.println("negavative numbr");
			
			s.close();
		}
		
	
		
		

	}

}
