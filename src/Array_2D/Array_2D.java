package Array_2D;

import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int row = 3,col=3;
		int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("2D Enter the B matrix  :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) 
				System.out.print(a[i][j]+" ");
		}
		System.out.println("2D matrix A :");
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++) 
				System.out.print(a[i][j]+" ");
				System.out.println();
				
			s.close();		}
		
	}


