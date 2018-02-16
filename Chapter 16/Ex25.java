import java.util.*;

public class Ex25 {
	public static void start(){
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(l);
		System.out.println(l.get(4));
		l.add(6);
		l.addAll(Arrays.asList(7,8));
		System.out.println(l);
		List<Integer> l2 = new ArrayList<Integer>(l.subList(2, 4));
		System.out.println(l2);
	}
}
