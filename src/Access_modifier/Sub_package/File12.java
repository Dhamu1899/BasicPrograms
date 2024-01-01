package Access_modifier.Sub_package;

import Access_modifier.File1;

public class File12 {

	public static void main(String[] args) {
		File1 obj=new File1();
		obj.display();
		System.out.println(obj.a);

	}

}
//private modifier is visible only inside the class
//public - visible to the world
//protected = visible to same package and sub package


	
