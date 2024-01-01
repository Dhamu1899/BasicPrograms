package switch_case;


public class Pattern3 {

	public static void main(String[] args) {
		int n;
		n=5;
		System.out.println("Enter The number : ");
		for(int i=1;i<=n;i++) {
			for(int space=n;space>i;space--) {
				System.out.print(" ");
			}
				for(int j=n;j>=i;j++) {
					System.out.print("* ");
					
				}
			
			System.out.println();
			
		}
				

	}

}
