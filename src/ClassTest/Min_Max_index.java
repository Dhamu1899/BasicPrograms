package ClassTest;

public class Min_Max_index {
	
	public int minArray(int[] a) {
		int min =0;
		
		for(int i =0; i<a.length; i++) {
			if(i == 0) {
				min = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		
		return min;
	}
	
	
	public int maxArray(int[] a) {
		int max =0;
		
		for(int i =0; i<a.length; i++) {
			if(i == 0) {
				max = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		
		return max;
	}
	
	public int findArray(int[] a, int n) {
		int find = 0 ;
		for(int i =0; i<a.length; i++) {
			if(i == n) {
				find = a[i];
			}
			
	}
		return find;
		
	}
	
	public int arrayPrimenumber(int a[]) {
		
		int n= a.length;
		int count =0;
		
		for(int i=0;i<n;i++) {
			for(int j=2;j<=a[i];j++)
			{
				if(a[i]%j == 0)
					count++;
			}
			if(count == 1)
			System.out.print(a[i]+" ");
			count=0;
		}
		return count;
		
	}

		
}
