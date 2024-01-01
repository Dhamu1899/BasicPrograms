package ClassTest;

import java.util.Scanner;

public class Test_case6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        
	        int sum = 0;
	        for (int number : arr) {
	            sum += number;
	        }

	        double average = (double) sum / n;

	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);
	    }
	}