package ClassTest;

public class PrimeNumber {

	public static void main(String[] args) {
		int []arr= {3,5,7,9,11,13,15,17,19,22};
		
		int count=0;
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
				System.out.println(arr[i]+" is not a prime number");
				break;
			}
			if(count==0 && arr[i]!=1)
				System.out.println(arr[i]+" is a prime number");
		}
		
	}
}
