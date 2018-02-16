import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class Ex17 {
	public static void start(String filename){
		Pattern p = Pattern.compile("(//.+)|(//*.+)|([*]/.*)");
		Matcher m = p.matcher("");
		boolean flag = false;
		for(String line : new TextFile(filename)) {
		      m.reset(line);
		      while(m.find()){
		        System.out.println(m.group());
		        if (m.group().contains("/*")) 
		        	flag = true;
		        if (m.group().contains("*/"))
		        	flag = false;
		      }
		        if ((flag == true) && (!line.contains("/*")))
		        	System.out.println(line);
		    }
	}
}
