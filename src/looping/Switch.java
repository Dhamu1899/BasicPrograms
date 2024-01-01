package looping;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the Greade");
		char ch=scan.next().charAt(0);
		switch(ch)
		{
		case'A':System.out.println("Excellent");
		break;
		case'B':
		case'C':System.out.println("Well Done");
		break;
		case'D':
		System.out.println("You Passed");
		case'F':
		System.out.println("Better try again");
		break;
		default:
		System.out.println("Invalid Grade");
	
		}
	System.out.println("Your Grade is "+ch);
		scan.close();
		

	}

}
