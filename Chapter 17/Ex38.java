import java.util.*;
public class Ex38{
	public static void start(){
		final int CAPACITY = 100;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(CAPACITY);
		for (int i = 0; i < CAPACITY / 2; i++)
			hm.put(i, i*2 + i);
		long start = System.nanoTime();
		for (int i = 0; i < 1000; i++)
			hm.containsKey(i);
		long stop = System.nanoTime();
		System.out.println("50% loading coef " +  (stop - start));
		HashMap<Integer, Integer> hm2 = new HashMap<Integer, Integer>(CAPACITY*10);
		hm2.putAll(hm);
		start = System.nanoTime();
		for (int i = 0; i < 1000; i++)
			hm2.containsKey(i);
		stop = System.nanoTime();
		System.out.println("50% loading coef " +  (stop - start));
	}
}