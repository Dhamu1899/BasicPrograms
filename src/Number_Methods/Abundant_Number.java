package Number_Methods;
import java.util.Scanner;

public class Abundant_Number {

	public static void main(String[] args) {
		int n ,sum=0,r,num = 0;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter The Number = ");
		n=s.nextInt();
		 for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
		 }
			   if (num > n) 
	            System.out.println("Aboundantnumber");
	        
			   else 
				   System.out.println(" Not a Aboundant Number");
				  
				   
				   
			   s.close();
			   }
			   
		
}
		 
	

	        
	        
	        
	       
	   
	  
