import java.util.*;

public class Ex27 {
	public static void start(){
		List<? extends Number> li = new LinkedList<Integer>();
		li.add(null);
		Number i = li.get(0);
	}
}
