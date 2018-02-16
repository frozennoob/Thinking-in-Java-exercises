import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.mindview.util.*;

public class Ex15 {
	public static void start(String[] args){
		if(args.length < 3) {
		      System.out.println("Usage: java JGrep file regex");
		      System.exit(0);
		    }
		    int flag = 0;
		    if(args[2].equals("Pattern.CASE_INSENSITIVE")) 
				flag = Pattern.CASE_INSENSITIVE;
			Pattern p = Pattern.compile(args[1],flag);
		    // Iterate through the lines of the input file:
		    int index = 0;
		    Matcher m = p.matcher("");
		    for(String line : new TextFile(args[0])) {
		      m.reset(line);
		      while(m.find())
		        System.out.println(index++ + ": " +
		          m.group() + ": " + m.start());
		    }
	}
}
