import java.util.*;
public class Ex17{
	public static void start(){
		SlowMap sm = new SlowMap<Integer, String>();
		HashMap hm = new HashMap<Integer,String>();
		System.out.println(sm.isEmpty());
		sm.put(11, "h");
		System.out.println(sm.isEmpty());
		System.out.println(sm.containsKey(11));
		System.out.println(sm.containsKey(23));
	}
}
