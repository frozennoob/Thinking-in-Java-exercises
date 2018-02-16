import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex7 {
public static void start(){
	String msg1 = "Her vam suki.";
	String msg2 = "her vam suki.";
	String msg3 = "Her vam suki";
	Pattern p = Pattern.compile("^[A-Z].+\\.$");
	Matcher m = p.matcher(msg1);
	System.out.println(m.matches());
	Matcher m2 = p.matcher(msg2);
	System.out.println(m2.matches());
	Matcher m3 = p.matcher(msg3);
	System.out.println(m3.matches());
}
}
