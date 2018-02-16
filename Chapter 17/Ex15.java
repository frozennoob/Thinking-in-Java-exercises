import java.util.*;
import net.mindview.util.*;

public class Ex15{
	public static void start(){
		SlowMap<String,Integer> m= new SlowMap<String,Integer>();
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


