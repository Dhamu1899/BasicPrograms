package Arrays;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner (System.in);
		System.out.print("Input :");
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)			
		{
        arr[i]=s.nextInt();
		}
        for(int i=0;i<n;i++)
        {
        System.out.println(arr[i]);
		
	}
        s.close();

}
}
