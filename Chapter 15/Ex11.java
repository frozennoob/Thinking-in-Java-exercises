import java.util.*;

public class Ex11 {
	static void f(Map<Integer, List<String>> intStr){}
	public static void start(){
		Map<String, List<String>> sls = New.map();
	    List<String> ls = New.list();
	    LinkedList<String> lls = New.lList();
	    Set<String> ss = New.set();
	    Queue<String> qs = New.queue();
	    Ex11_1<String,Integer> ex11 = New.ex11_1();
	    f(New.<Integer,List<String>>map());
	}
}

class Ex11_1<K,V>{}
class New {
	  public static <K,V> Map<K,V> map() {
	    return new HashMap<K,V>();
	  }
	  public static <T> List<T> list() {
	    return new ArrayList<T>();
	  }
	  public static <T> LinkedList<T> lList() {
	    return new LinkedList<T>();
	  }
	  public static <T> Set<T> set() {
	    return new HashSet<T>();
	  }	
	  public static <T> Queue<T> queue() {
	    return new LinkedList<T>();
	  }
	  public static <K,V> Ex11_1<K,V> ex11_1() {
		    return new Ex11_1<K,V>();
		  }
	  }