package ClassTest;

import java.util.Scanner;

public class SpyNumber1 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        if (isSpyNumber(number)) {
		            System.out.println(number + " is a spy number.");
		        } else {
		            System.out.println(number + " is not a spy number.");
		        }
		    }

		   
		    public static boolean isSpyNumber(int num) {
		        int sumOfDigits = 0;
		        int productOfDigits = 1;
		        int originalNum = num;

		        while (num > 0) {
		            int digit = num % 10;
		            sumOfDigits += digit;
		            productOfDigits *= digit;
		            num /= 10;
		        }
		        

		        return sumOfDigits == productOfDigits && originalNum > 0;
		      
		        
		    }
		    
	}


