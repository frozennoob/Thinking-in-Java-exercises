import java.util.*;
import net.mindview.util.*;

public class Ex4 {
	public static void start(){
		Set<String> sc = new HashSet<String>();
		Set<String> lsc = new LinkedHashSet<String>();
		Set<String> tsc = new TreeSet<String>();
		for (int i = 0; i < 5; i++)
			for (String[] s : Countries.DATA){
				sc.add(s[0]);
				lsc.add(s[0]);
				tsc.add(s[0]);
			}
		System.out.println(sc);
		System.out.println(lsc);
		System.out.println(tsc);
	}
}
