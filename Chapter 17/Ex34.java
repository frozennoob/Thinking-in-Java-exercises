//p.702
import java.util.*;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;
public class Ex34{
	public static void start(){
		SetPerformance34.start();
	}
}

class SetPerformance34 {
	  static List<Test<Set<String>>> tests =
	    new ArrayList<Test<Set<String>>>();
	  static {
	    tests.add(new Test<Set<String>>("add") {
	      int test(Set<String> set, TestParam tp) {
	        int loops = tp.loops;
	        int size = tp.size;
	        for(int i = 0; i < loops; i++) {
	          set.clear();
	          set.addAll(Arrays.asList(Generated.array(String.class, 
	  				new CountingGenerator.String(), size)));
	        }
	        return loops * size;
	      }
	    });
	    tests.add(new Test<Set<String>>("contains") {
	      int test(Set<String> set, TestParam tp) {
	        int loops = tp.loops;
	        int span = tp.size * 2;
	        for(int i = 0; i < loops; i++)
	          for(int j = 0; j < span; j++)
	            set.contains(((Integer)j).toString());
	        return loops * span;
	      }
	    });
	    tests.add(new Test<Set<String>>("iterate") {
	      int test(Set<String> set, TestParam tp) {
	        int loops = tp.loops * 10;
	        for(int i = 0; i < loops; i++) {
	          Iterator<String> it = set.iterator();
	          while(it.hasNext())
	            it.next();
	        }
	        return loops * set.size();
	      }
	    });
	  }
	  public static void start() {
	    Tester.fieldWidth = 10;
	    Tester.run(new TreeSet<String>(), tests);
	    Tester.run(new HashSet<String>(), tests);
	    Tester.run(new LinkedHashSet<String>(), tests);
	  }
	}