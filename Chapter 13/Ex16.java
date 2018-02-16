import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class Ex16 {
	public static void start(String[] args){
		if(args.length < 2) {
		      System.out.println("Usage: java JGrep file regex");
		      System.exit(0);      
		}  
		Pattern f = Pattern.compile("\\w(\\w*\\d*\\s*\\\\*)*\\.\\w(\\w*\\d*\\s*)*");
		Matcher fm = f.matcher(args[0]);
		System.out.println(fm.matches());
		File[] files;
		if(!fm.matches())
			files = new File(args[0]).listFiles();
		else
			files =  new File[] {new File (args[0])};
		Pattern p = Pattern.compile(args[1]);
		    // Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher("");
		for (int i  = 0; i < files.length; i ++){
			System.out.println();
			System.out.println(files[i].getAbsolutePath());
			for(String line : new TextFile(files[i].getAbsolutePath())) {
				m.reset(line);
				while(m.find())
					System.out.print(index++ + ": " +
		  							m.group() + ": " + m.start());   
			}
		}
	}
}
