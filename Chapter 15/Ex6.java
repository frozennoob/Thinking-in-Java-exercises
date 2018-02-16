import java.util.*;

public class Ex6 {
	public static void start(){
		RandomList<String> rs = new RandomList<String>();
		int[] a = {1,2,3,4,5,6,7,8};
	    for(String s: ("The quick brown fox jumped over " +
	        "the lazy brown dog").split(" "))
	      rs.add(s);
	    for(int i = 0; i < 11; i++)
	      System.out.print(rs.select() + " ");
	    RandomList<Integer> rs2 = new RandomList<Integer>();
	    for(int i: a)
		      rs2.add(i);
		for(int i = 0; i < 11; i++)
		      System.out.print(rs2.select() + " ");
	}
}

class RandomList<T> {
	  private ArrayList<T> storage = new ArrayList<T>();
	  private Random rand = new Random(47);
	  public void add(T item) { storage.add(item); }
	  public T select() {
	    return storage.get(rand.nextInt(storage.size()));
	  }
}