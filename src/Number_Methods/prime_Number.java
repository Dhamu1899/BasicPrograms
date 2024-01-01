package Number_Methods;

import java.util.Scanner;

public class prime_Number {

	public static void main(String[] args) {
		int n,number=2;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(number==2) {
				System.out.print(2+" ");
				number++;
			}
			else {
				Task:
		for(int j=2;j<=number/2;j++ ) {
			if(number%j==0){
				number++;
				continue Task;
			}
			
		}
				System.out.print(number++ +" ");
				s.close();
			}
		}
	}
}

