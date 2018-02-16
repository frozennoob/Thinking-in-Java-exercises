import java.util.*;
import static net.mindview.util.Tuple.*;
import net.mindview.util.*;
import net.mindview.util.FiveTuple;

public class Ex15 {
	public static <A,B,C,D,E,F>
	SixTuple<A,B,C,D,E,F> tuple6(A a, B b, C c, D d, E e, F f) {
	  return new SixTuple<A,B,C,D,E,F>(a, b, c, d, e, f);
	}
	static SixTuple<String,Integer,Amphibian,Vehicle,Character,Double> f6() {
	    return tuple6("hi", 47,new Amphibian(), new Vehicle(), 'a', 6.98);
	  }
	  static SixTuple f62() { return tuple6("hi", 47,new Amphibian(), new Vehicle(), 'a', 6.98); }
	static net.mindview.util.TwoTuple<String,Integer> f() {
	    return tuple("hi", 47);
	  }
	  static net.mindview.util.TwoTuple f2() { return tuple("hi", 47); }
	  static net.mindview.util.ThreeTuple<Amphibian,String,Integer> g() {
	    return tuple(new Amphibian(), "hi", 47);
	  }
	  static
	  net.mindview.util.FourTuple<Vehicle,Amphibian,String,Integer> h() {
	    return tuple(new Vehicle(), new Amphibian(), "hi", 47);
	  }
	  static
	  net.mindview.util.FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
	    return tuple(new Vehicle(), new Amphibian(),
	      "hi", 47, 11.1);
	  }
	  
	public static void start(){
		net.mindview.util.TwoTuple<String,Integer> ttsi = f();
		net.mindview.util.TwoTuple<String,Integer> ttsi2 = f2();
	    System.out.println(ttsi);
	    System.out.println(f2());
	    System.out.println(g());
	    System.out.println(h());
	    System.out.println(k());
	    SixTuple t6 = f6();
	    System.out.println(t6);
	    t6 = f62();
	    System.out.println(t6);
	}
}
class Amphibian{}
class Vehicle{}