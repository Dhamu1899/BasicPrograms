package ClassTest;

import java.util.Scanner;

public class Test_case4 {

	public static void insertionSort(int n,int ar[]) {
		int t,k;
		for(int step=1;step<n;step++) {
			k=step;
			for(int i=step-1;i>=0;i--) {
			if(ar[i]>ar[k]) {
				t=ar[i];
				ar[i]=ar[k];
				ar[k]=t;
				k--;
			}
		}
	}
}
		static void printArray(int n,int ar[]) {
			System.out.println("After sorting:");
			for(int i=0;i<n;i++) {
				System.out.print(ar[i]+" ");
			}
		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
	System.out.print("Enter the element:");
	int n=s.nextInt();
	int ar[]=new int [n];
	System.out.print("Enter the array elements:");
		for(int i=0;i<n;i++) {
	 ar[i]=s.nextInt();
		}
		insertionSort(n,ar);
		printArray(n,ar);
		s.close();
	

	}

}
