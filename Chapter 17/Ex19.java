import java.util.*;

import net.mindview.util.TextFile;
public class Ex19{
	public static void start(){
		SimpleHashMap<String,Integer> m= new SimpleHashMap<String,Integer>();
	    final String FILENAME = "src\\Ex12.java";
		TextFile file = new TextFile(FILENAME, "\\W+");
		for (String s : file)
			if (m.get(s) != null)
				m.put(s, m.get(s)+1);
			else
				m.put(s, 1);
		System.out.println(m);
	}
}