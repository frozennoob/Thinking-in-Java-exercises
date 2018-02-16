import java.util.*;
import net.mindview.util.*;

public class Ex30{
	public static void start(){
		final int LISTSIZE = 1000;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.addAll(Arrays.asList(Generated.array(Integer.class, 
				new CountingGenerator.Integer(), LISTSIZE)));
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addAll(Arrays.asList(Generated.array(Integer.class, 
				new CountingGenerator.Integer(), LISTSIZE)));
		long start = System.nanoTime();
	    Collections.sort(al);
		long duration = System.nanoTime() - start;
		System.out.println(duration);
		start = System.nanoTime();
	    Collections.sort(ll);
		duration = System.nanoTime() - start;
		System.out.println(duration);
	}
}