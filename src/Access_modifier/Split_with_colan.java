package Access_modifier;

import java.util.Arrays;

public class Split_with_colan {

	public static void main(String[] args) {
		String vowels="a:bc:de:fg:h";
		
		//split array at ":"
		//limit is-2 contain all substring
		String[]result=vowels.split(":",-2);
		
		System.out.println("result when limit is -2 ="+Arrays.toString(result));
		
		
        result=vowels.split(":",0);
		
		System.out.println("result when limit is 0 ="+Arrays.toString(result));
		
		
		 result=vowels.split(":",2);
			
		System.out.println("result when limit is 2 ="+Arrays.toString(result));
			

	     result=vowels.split(":",4);
				
		System.out.println("result when limit is 4 ="+Arrays.toString(result));
				

	    result=vowels.split(":",10);
					
		System.out.println("result when limit is 10 ="+Arrays.toString(result));
					

		
		

	}

}
