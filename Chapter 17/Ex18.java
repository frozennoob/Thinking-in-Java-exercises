import java.util.*;
public class Ex18{
	public static void start(){
		Set<Integer> s = new HashSet<Integer>();
		SlowSet<Integer> ss = new SlowSet<Integer>();
		ss.add(123);
		ss.add(323);
		for (Integer i : ss)
			System.out.println(i);
	}
}