package ClassTest;

import java.util.Scanner;

public class Small_val_find {

	public static void main(String[] args) {
		int min=0,max=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();	
		int arr[]=new int[n];
		System.out.println("Enter the value:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i==0) {
				min=arr[i];
				max=arr[i];
			}
				if(arr[i]<min) {
					min=arr[i];
				}
				if(arr[i]>max) {
					min=arr[i];
				}
			}
		System.out.println("min:"+min);
		System.out.println("max:"+max);
			
		}
		
	}
	


