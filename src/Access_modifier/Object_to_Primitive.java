package Access_modifier;

public class Object_to_Primitive {

	public static void main(String[] args) {
		//creates object of wrapper class
		Integer obj1=Integer.valueOf(23);
		Double obj2=Double.valueOf(5.55);
		Boolean obj3=Boolean.valueOf(true);
		
		//converts into primitive type
		int var1= obj1.intValue();
		double var2=obj2.doubleValue();
		boolean var3=obj3.booleanValue();
		//print the primitive value
		System.out.println("the value of int variable:"+var1);
		System.out.println("the value of double variable:"+var2);
		System.out.println("the value of boolean variable:"+var3);

	}

}
