package Arrays;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		int n,pos = 0;
		Scanner s=new Scanner (System.in);
		System.out.print("Input :");
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		for(int i=0;i<pos;i++)
		{
			System.out.print(arr[i]);
			
		}
		for(int i=pos;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		s.close();
	}
	

	
}
