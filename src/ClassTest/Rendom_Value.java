package ClassTest;

import java.util.Random;

public class Rendom_Value {
	

	public static void main(String[] args) {
		String[] arr = {"one","two","three","four"};
		Random random = new Random();
		int c = random.nextInt(arr.length);
		System.out.println(arr[c]);
			
		}

	}

