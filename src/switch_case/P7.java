package switch_case;

public class P7 {

	public static void main(String[] args) {
		int n;
		n=5;
		for(int i=1;i<=n;i++) 
		{
			for(int space=1;space<=n-i;space++)
			{
				System.out.print(" ");			
			}
			
			for(int j=1;j<=i;j++) 
			{
				System.out.print(j+" ");
			
				}
			
			System.out.println();
			
		}
		
	}

	}

