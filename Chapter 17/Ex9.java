//стр. 655
import java.util.*;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import net.mindview.util.*;

public class Ex9 {
	public static void start(){
		Set<String> set = new TreeSet<String>();
		RandomGenerator.String rgs = new RandomGenerator.String();
		for (int i = 0; i < 10; i ++)	
			set.add(rgs.next());
		System.out.println(set);
	}
}
