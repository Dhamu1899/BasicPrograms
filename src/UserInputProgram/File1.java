package UserInputProgram;

import java.util.Scanner;

public class File1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int num1,num2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print( "Enter the num 1 = " );
		num1 = s.nextInt();
		System.out.print( "Enter the num 2 = " );
		num2 = s.nextInt();

		
		System.out.println("sum of the two numbers =" + (num1+num2) );
		
		s.close();
		
		
		
		
		
//		 Scanner myObj = new Scanner(System.in);
//		    String userName;
//		    
//		    // Enter username and press Enter
//		    System.out.println("Enter username"); 
//		    userName = myObj.nextLine();   
//		       
//		    System.out.println("Username is: " + userName); 
		

	}

}
