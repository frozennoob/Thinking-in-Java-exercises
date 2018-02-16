import java.util.*;

public class Ex14 {
	public static void start(){
		LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(1,2,3,4));
		ListIterator<Integer> ii = ll.listIterator();
		ii.next();
		ii.add(5);
		ii.next();
		ii.next();
		ii.add(6);
		ii = ll.listIterator(0);
		while(ii.hasNext()) 
			System.out.print(ii.next() + " ");
	}
}
