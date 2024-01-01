package Access_modifier;

public class File1 {
	public int a=10;//class variable - default access modifier
	//Visible inside the package
	private int b=10;
	//private modifier is visible only inside the class
	public void display() {
		System.out.println("a ="+a);
		System.out.println("b ="+b);
	}
	
	public static void main(String[] args) {
		

	}

}
