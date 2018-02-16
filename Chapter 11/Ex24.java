import java.util.*;

public class Ex24 {
	public static void start(){
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("China", "Pekin");
		m.put("Russia", "Moscow");
		m.put("USA", "Washington");
		m.put("France", "Paris");
		m.put("Great Britain", "London");
		Map<String,String> tm = new TreeMap<String,String>(m);
		m.clear();
		m = tm;
		System.out.println(m);
	}
}
