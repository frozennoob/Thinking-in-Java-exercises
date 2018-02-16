import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex12 {
	public static void start(){
		String POEM =
			    "Twas brillig, and the slithy toves\n" +
			    "Did gyre and gimble in the wabe.\n" +
			    "All mimsy were the borogoves,\n" +
			    "And the mome raths outgrabe.\n\n" +
			    "Beware the Jabberwock, my son,\n" +
			    "The jaws that bite, the claws that catch.\n" +
			    "Beware the Jubjub bird, and shun\n" +
			    "The frumious Bandersnatch.";
		Matcher m = Pattern.compile("(^[a-z]|\\s+[a-z])\\w+").matcher(POEM);
		Set<String> words = new TreeSet<String>();
		while(m.find()) {
			words.add(m.group());
		}
		System.out.println("Number of unique non-cap words = " + words.size());
		System.out.println(words);
	}
}
