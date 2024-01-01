package Arrays;

import java.util.Scanner;

public class Nonrepetedelementprint_Pro {

	public static void main(String[] args) {
		int n,count,flag=0 ;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the array size :");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element :");
		for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
		System.out.println("Enter the element are :");
	for(int i=0;i<n;i++)
	{
		count=0;
	for(int j=0;j<n;j++)
	{
	
		if(arr[i]==arr[j] && i!=j)
			count++;
	}
		
		
				if (count==0) {
					System.out.println(arr[i]+" ");
				flag=1;
			}
			
			}
	if (flag==0)
		System.out.println("all the element are repeted :");
	s.close();
		}
}

