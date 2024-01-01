package Arrays;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int n,r,reverse=0;
		Scanner s=new Scanner (System.in);
		//System.out.print("Enter the Number =");
		n=s.nextInt();
		while(n!=0) {
			r=n%10;
			reverse=reverse*10+(++r);	
			n=n/10;
			
		}
		while(reverse !=0) {
			r=reverse%10;
			System.out.print(r);	
			reverse=reverse/10;
		
		
		
	}
		s.close();

}
}
