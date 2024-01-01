package looping;

public class Break {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			
		if(i==6) {
			//break;
			continue;
		}
		else {
			System.out.println("i="+i);
		}
		}
		System.out.println("completed");
		

	}

}
