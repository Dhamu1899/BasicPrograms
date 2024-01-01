package Access_modifier;

public class Convert_boolean_to_String {

	public static void main(String[] args) {
		//create a boolean variable
		boolean booleanValue1=true;
		boolean booleanValue2=false;
		
		//convert boolean to string using toString()
		String stringValue1=Boolean.toString(booleanValue1);
		String stringValue2=Boolean.toString(booleanValue2);
		
		
		System.out.println(stringValue1);//true
		System.out.println(stringValue2);//false

	}

}
