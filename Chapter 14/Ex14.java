import java.util.*;

public class Ex14 {
	public static void start(){
		System.out.println("-------EX 14--------" );
		for(int i = 0; i < 10; i++)
		      System.out.println(Part.createRandom());
	}
}
class Part2 {
	  public String toString() {
	    return getClass().getSimpleName();
	  }
	  static List<Part2> partFactories =
	    new ArrayList<Part2>();	
	  static {
	    // Collections.addAll() gives an "unchecked generic
	    // array creation ... for varargs parameter" warning.
		Class c = null;
		String[] classnames = {
				"FuelFilter2",
				"CabinAirFilter2",
				"OilFilter2",
				"FanBelt2",
				"PowerSteeringBelt2",
				"GeneratorBelt2",
				"AirFilter2",
		};
		for (String s : classnames)
			try {
				partFactories.add((Part2) c.forName(s).newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  private static Random rand = new Random(47);
	  public static Part2 createRandom() {
	    int n = rand.nextInt(partFactories.size());
	    return partFactories.get(n);
	  }
	}	
	class Filter2 extends Part2 {}
	class FuelFilter2 extends Filter2 {}
	class AirFilter2 extends Filter2 {}	
	class CabinAirFilter2 extends Filter2 {}	
	class OilFilter2 extends Filter2 {}	
	class Belt2 extends Part2 {}
	class FanBelt2 extends Belt2 {}
	class GeneratorBelt2 extends Belt2 {}	
	class PowerSteeringBelt2 extends Belt2 {}	