package Arrays;

import java.util.Scanner;

public class File_1 {

	void printarray(int n,int arr[]) {
		System.out.println("Array Element : ");
	    for(int i=0;i<n;i++) 
	System.out.println(arr[i]);
	   
	}

	public static void main(String[] args) {
		int n;
		File_1 obj=new File_1();
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter the number of element : ");
		int arr[] = new int[n];
		System.out.println("Enter the number of elements one by one : ");
	    for(int i=0;i<n;i++)
	    arr[i]=s.nextInt();
	    obj.printarray(n,arr);
	    s.close();
	    
		
		

	}

}
