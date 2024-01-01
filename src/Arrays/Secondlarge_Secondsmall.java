package Arrays;

import java.util.Scanner;

public class Secondlarge_Secondsmall {

	public static void main(String[] args) {
		int n,temp;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter the array size :");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element one by one : ");
		for(int i=0;i<n;i++)		
			arr[i]=s.nextInt();
						
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
			if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println("After Sorting array element are : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[1]);//second smaller
			System.out.println(arr[n-2]);// Second larger
			
		}
		s.close();

	}

}
