//p.705
import java.util.*;
public class Ex35{
	public static void start(){
		MapPerformance35.start();
	}
}

class MapPerformance35 extends MapPerformance{
	public static void start() {
		String[] args = new String[]{"10","500", "50" , "500", "250", "500"};
		MapPerformance.start(args);
	    Tester.run(new SlowMap<Integer,Integer>(), tests);
	  }
}