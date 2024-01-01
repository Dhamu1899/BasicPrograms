package Access_modifier;

import java.util.Arrays;

public class String_to_chararray {

	public static void main(String[] args) {
		String st="this is great";
		
		char[]chars=st.toCharArray();
		for(int i=0;i<chars.length;i++) {
			System.out.print(chars[i]+", ");
		}
		System.out.println();
		System.out.println(Arrays.toString(chars));
	}

}
