package Arrays;

import java.util.Scanner;

public class CounttheNumberof_Occurrence {

	
		public static void main(String[] args) {
			int n,count=0;
			Scanner s=new Scanner (System.in);
			System.out.print("Enter the no element you want :");
			n=s.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the all element : ");
			for(int i=0;i<n;i++) {		
				arr[i]=s.nextInt();
					
			}
			System.out.println("Enter no of occurrence : ");
			int element=s.nextInt();
			for(int i=0;i<n;i++) {
			
		   if(arr[i]==element) {
				count++;			

	}
		if(count==0)		{
			System.out.println("Element not valid");
		}
			else {
				System.out.println("Number of occurrence of the element:"+count);
		}

}
			
			s.close();
		}
}

