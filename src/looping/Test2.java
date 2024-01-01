package looping;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of element");
		n=s.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter the array  element one by one ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		System.out.print("output");
	
			s.close();
		}
	}
