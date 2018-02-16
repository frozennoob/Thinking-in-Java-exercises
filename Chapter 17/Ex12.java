//p.670
import java.util.*;
public class Ex12 {
	public static void start(){
		AssociativeArray<String,String> map =
			      new AssociativeArray<String,String>(6);
			    map.put("sky", "blue");
			    map.put("grass", "green");
			    map.put("ocean", "dancing");
			    map.put("tree", "tall");
			    map.put("earth", "brown");
			    map.put("sun", "warm");
			    try {
			      map.put("extra", "object"); // Past the end
			    } catch(ArrayIndexOutOfBoundsException e) {
			      System.out.println("Too many objects!");
			    }
			    System.out.println(map);
			    System.out.println(map.get("ocean"));
			    Map<String, String> hm = new HashMap<String, String>();
			    Map<String, String> tm = new TreeMap<String, String>();
			    Map<String, String> lhm = new LinkedHashMap<String, String>();
			    
			    hm.put("sky", "blue");
			    hm.put("grass", "green");
			    hm.put("ocean", "dancing");
			    hm.put("tree", "tall");
			    hm.put("earth", "brown");
			    hm.put("sun", "warm");

			    tm.put("sky", "blue");
			    tm.put("grass", "green");
			    tm.put("ocean", "dancing");
			    tm.put("tree", "tall");
			    tm.put("earth", "brown");
			    tm.put("sun", "warm");
			    
			    lhm.put("sky", "blue");
			    lhm.put("grass", "green");
			    lhm.put("ocean", "dancing");
			    lhm.put("tree", "tall");
			    lhm.put("earth", "brown");
			    lhm.put("sun", "warm");
			    
			    System.out.println(hm);
			    System.out.println(hm.get("ocean"));
			    System.out.println(tm);
			    System.out.println(tm.get("ocean"));
			    System.out.println(lhm);
			    System.out.println(lhm.get("ocean"));
			    
	}
}

