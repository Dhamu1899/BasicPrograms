package ClassTest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Four digit number : ");
		int n=s.nextInt();
		int result;
		String str1=String .valueOf(n);
		if (str1.length()==4) {
		
		result=(int)Math.pow(n/100+n%100,2);
		if(n==result)
			System.out.println(n+"is a tech number");
		else
			System.out.println(n+"is not a tech number");
	
	}
		else
			System.out.println("Not a valid number");
		s.close();

}
}

