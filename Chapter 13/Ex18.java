import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class Ex18 {
	public static void start(String filename){
		Pattern p = Pattern.compile("\".*\"");
		Matcher m = p.matcher("");
		for(String line : new TextFile(filename)) {
		      m.reset(line);
		      while(m.find())
		        System.out.println(m.group() + ": " + m.start());
		    }
	}
}
