package Access_modifier;

public class Split_the_String {

	public static void main(String[] args) {
		String text = "java is fun programming language";
		
		String[]result=text.split(" ");
		
		System.out.print("result =");
		
		for(String str:result) {
			System.out.print(str+",");
		}

	}

}
