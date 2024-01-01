package ClassTest;

public class Duplicate_Value {

	public static void main(String[] args) {
			String s = "raannjithkumar";	
			for(int i =0;i<s.length();i++) {						
				char ch = s.charAt(i);
				boolean repeat = false;	
			for(int j=i+1;j<s.length();j++) {
				if(ch == s.charAt(j)) 
				{
					repeat = true;
					System.out.println(ch + " repeated");
					break;	
				}
				}
				if(repeat == false)
				{
					break;
				}
			}
		}
	}

				
			