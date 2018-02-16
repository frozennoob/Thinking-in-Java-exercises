import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class Ex19 {
	public static void start(String filename){
		Pattern p = Pattern.compile("[A-Z]\\w*");
		Matcher m = p.matcher("");
		boolean flag = false;
		Set<String> words = new TreeSet<String>();
		for(String line : new TextFile(filename)) {
			line = line.replaceAll("\\/\\/.*", "");
			line = line.replaceAll("\".*\"", "");
			if (line.contains("/*")){
	        	flag = true;
	        	line = line.replaceAll("//*.*", "");
	        	m.reset(line);
	        	 while(m.find())
	 		        words.add(m.group());
			}
	        if (line.contains("*/"))
	        	flag = false;
			m.reset(line);
			if (flag) continue;
		      //if (line.matches("(.*\\/\\/.*)"))
		    	//  System.out.println("ERROR "+line);
		      while(m.find())
		        words.add(m.group());
		    }
		System.out.println(words);
		start2(filename);
	}
	public static void start2(String filename){	
		// we want all class names:
		Pattern p = Pattern.compile("class \\w+\\s+");
		// not including those in comment lines:
		Pattern q = Pattern.compile("^(//|/\\*|\\*)");
		System.out.println("classes in " + filename + ":");
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher(""); // creates emtpy Matcher object
		Matcher n = q.matcher("");
		for(String line : new TextFile(filename)) {
			m.reset(line);
			n.reset(line);
			while(m.find() && !n.find())
				System.out.println(index++ + ": " + m.group());
		}
	}
}
