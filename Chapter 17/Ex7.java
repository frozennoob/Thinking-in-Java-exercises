import java.util.*;
import net.mindview.util.*;

public class Ex7 {
	public static void start(){
		List<String> al = new ArrayList<String>(Countries.names(10));
		List<String> ll = new LinkedList<String>(Countries.names(10));
		for (String i : al) System.out.print(i + " ");
		System.out.println();
		for (String i : ll) System.out.print(i + " ");
		System.out.println();
		ListIterator<String> ial = al.listIterator(5);
		for (String s : ll)
			ial.add(s);
		System.out.println(al);
		while (ial.nextIndex() != al.size())
			ial.next();
		System.out.println(ial.nextIndex());
		for (String s : ll){
			ial.add(s);
			ial.previous();
		}
		System.out.println(al);
	}
}
