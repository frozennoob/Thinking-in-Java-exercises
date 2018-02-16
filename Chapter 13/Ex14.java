import java.util.*;
import java.util.regex.Pattern;

public class Ex14 {
	public static void start(){
		String input =
			      "This!!unusual use!!of exclamation!!points";
			  	/*System.out.println(Arrays.toString(
			      Pattern.compile("!!").split(input)));
			    // Only do the first three:
			    System.out.println(Arrays.toString(
			      Pattern.compile("!!").split(input, 3)));	  */
		System.out.println(Arrays.toString(input.split("!!")));
		System.out.println(Arrays.toString(input.split("!!",3)));
	}
}
