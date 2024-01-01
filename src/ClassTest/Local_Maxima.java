package ClassTest;

import java.util.Scanner;

public class Local_Maxima {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the Number of element: ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the Element: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();		
	}
		int max = arr[0];
		
		  for (int i = 0; i < arr.length; i++) {  
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
		  
		   System.out.println("Largest element: " + max);
		   s.close();
	}
}
