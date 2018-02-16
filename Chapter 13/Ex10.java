import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Проверка 1
public class Ex10 { /* asdadadadadaADSASd
	class Vovov  
	adadadsad
	adadadASDASDASd
	*/
	public static void start(){
		String msg = "Java now has regular expressions";
		Pattern[] p = {Pattern.compile("^Java"),
					Pattern.compile("\\Breg.*"),
					Pattern.compile("n.w\\s+h(a|i)s"),
					Pattern.compile("s?"), 
					Pattern.compile("s*"),
					Pattern.compile("s+"),
					Pattern.compile("s{4}"), //Test 2
					Pattern.compile("s{1}"), 	// Test 3
					Pattern.compile("s{0,3}")}; 
		Matcher[] m = new Matcher[p.length];
		for (int i = 0; i < p.length; i++)
			m[i] = p[i].matcher(msg);
		for (int i = 0; i < p.length; i++)
			System.out.print(m[i].find() + "; ");
		
	}
	/*
	123123131
	ADASDAD
	*/
	//asdasd
}
