import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex11 {
	public static void start(){
		String msg = "Arline ate eight apples and one orange Anita hadn't any";
		String re = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(msg);
		while(m.find())
			System.out.println("Match \"" + m.group() + "\" at " + m.start());
	}
}
