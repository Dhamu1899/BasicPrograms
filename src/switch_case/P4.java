package switch_case;

public class P4 {

	public static void main(String[] args) {
		int n;
		n=5;
		for(int i=1;i<=n;i++) 
		{
			for(int space=1;space<i;space++)
			{
				System.out.print(" ");			
			}
			
			for(int j=n;j>=i;j--) 
			{
				System.out.print("* ");
			
				}
			
			System.out.println();
			
		}
			

	}

}
