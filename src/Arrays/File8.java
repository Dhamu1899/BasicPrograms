package Arrays;

import java.util.Scanner;

public class File8 {

	public static void main(String[] args) {
		int n,count=0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the array size :");
		n=s.nextInt();
		int arr[]=new int[n];
		int temp[]=new int[n];
		System.out.println("Enter the element from user");
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the array element of index :"+i);
		arr[i]=s.nextInt();
	}
		System.out.println("Befoure removeing duplicate element are:");
	for(int i=0;i<n;i++)
	{
		System.out.println(arr[i]);
		
	}
	System.out.println("After removing duplicate element are");
	for(int i=0;i<n;i++)
	{
		int flag=0;
		if(i==0)
		
			temp[count++]=arr[i];
		
		else
		{
			for(int j=0;j<count;j++) 
			{
				if (arr[i]==temp[j])
					flag=1;
			}
			if (flag==0)
			{
				temp[count++]=arr[i];
			}
		}
	}
	for(int i=0;i<count;i++)
	{
		System.out.println(temp[i]);
	}
	s.close();

}
}
