package looping;

public class Array {
	
	public static void main(String[] args) {
		//Array
		int arr[]= {10,20,30,40,50};//integer
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//for each Loop
		System.out.println("For each Loop:");
		for(int a:arr) {
			System.out.println(a);
		}
		
		System.out.println(arr); //object reference
		
}

	
}