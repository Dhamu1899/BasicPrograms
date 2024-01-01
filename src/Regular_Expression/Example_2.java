package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example_2 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("javaTraining",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Welcome JavaTaraining");
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("Match found");
		}
		else {
			System.out.println("Match not found");
		}

	}

}
