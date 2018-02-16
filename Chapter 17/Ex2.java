import java.util.*;
import net.mindview.util.*;

public class Ex2 {
	public static void start(){
		Map<String,String> mc = new LinkedHashMap<String,String>();
		Set<String> sc = new LinkedHashSet<String>();
		for(String[] s : Countries.DATA)
			if (s[0].charAt(0) == 'A'){
				mc.put(s[0], s[1]);
				sc.add(s[0]);
			}
		System.out.println(mc);
		System.out.println(sc);
	}
}
