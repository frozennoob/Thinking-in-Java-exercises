import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9 {
	public static void start(){
		String knights = "Then, when you have found the shrubbery, you must " +
				 "cut down the mightiests tree in the forest... " +
				 "with... a herring!";
		Pattern p = Pattern.compile("a|e|u|y|i|o");
		Matcher m = p.matcher(knights);
		while(m.find())
			System.out.println(m.replaceAll("_"));
	}
}
