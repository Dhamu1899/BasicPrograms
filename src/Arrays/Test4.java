package Arrays;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,element,count=0;
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
			System.out.println("Enter the element you want to check"+"Occurance");
			element=s.nextInt();
			for(int i=0;i<n;i++)
			{
			if(arr[i]==element)
				count++;
			
		}
			System.out.println(count);
			s.close();
		

	}

}
