import java.util.*;

public class Ex8 {
	public static void start(){
		SList<String> sl = new SList<String>();
		SList<String>.SListIterator<String> si = sl.iterator();
		si.add("Hello, ");
		si.add("my ");
		si.add("dear ");
		si.add("friend");
		System.out.println(sl);
		si = sl.iterator();
		si.next();
		si.next();
		si.remove();
		System.out.println(sl);
	}
}