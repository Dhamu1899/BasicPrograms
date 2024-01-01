package looping;

public class For {
	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};
		for (int x: number) {
		System.out.print(x);
		System.out.print(",");
	}
	System.out.println("\n");
		String[] names = {"pk","dk","ck","mk"};
		for (String name : names) {
			System.out.print(name);
			System.out.print(",");
	}

}
}