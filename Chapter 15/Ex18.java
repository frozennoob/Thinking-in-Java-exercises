import java.util.*;
import net.mindview.util.*;

public class Ex18 {
	public static void start(){
		Random rand = new Random(47);
		Queue<SmallFish> line = new LinkedList<SmallFish>();
		Generators.fill(line, SmallFish.generator(), 15);
		List<BigFish> bigFishes = new ArrayList<BigFish>();
		Generators.fill(bigFishes, BigFish.generator(),4);
		for (SmallFish sf : line)
			Sea.eat(bigFishes.get(rand.nextInt(bigFishes.size())), sf);
	}
}

class SmallFish{
	private static long counter = 1;
	private final long id = counter++;
	private SmallFish(){}
	public String toString() { return "Small Fish " + id;}
	public static net.mindview.util.Generator<SmallFish> generator(){
		return new net.mindview.util.Generator<SmallFish>(){
			public SmallFish next() { return new SmallFish();}
		};
	}
}

class BigFish{
	private static long counter = 1;
	private final long id = counter++;
	private BigFish(){}
	public String toString() { return "Big Fish " + id;}
	public static net.mindview.util.Generator<BigFish> generator(){
		return new net.mindview.util.Generator<BigFish>(){
			public BigFish next() { return new BigFish();}
		};
	}
}

class Sea{
	public static void eat (BigFish bf, SmallFish sf){
		System.out.println(bf + " eats " + sf);
	}
}
class Generators {
	  public static <T> Collection<T>
	  fill(Collection<T> coll, net.mindview.util.Generator<T> gen, int n) {
	    for(int i = 0; i < n; i++)
	      coll.add(gen.next());
	    return coll;
	  }	
}