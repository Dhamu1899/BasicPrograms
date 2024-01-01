package Access_modifier;

public class Convert_char_to_String {

	public static void main(String[] args) {
		char ch='c';
		String str=Character.toString(ch);
		//Alternative
		String str1=String.valueOf(ch);
		System.out.println("the string is:"+str);
		System.out.println("the string is:"+str1);
		

	}

}
