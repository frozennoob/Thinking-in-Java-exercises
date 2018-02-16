import java.util.*;

public class Ex23 {
	public static void start(){
		Map<Integer, Integer> m = new HashMap<Integer,Integer>();
		for (int i = 0; i < 100; i ++){
			int max = statistics();
			m.put(max, m.get(max) == null ? 1 : m.get(max) +1);
		}
		System.out.println(m);
	}
	static int statistics(){
		Random rand = new Random(47);
		Map<Integer, Integer> m =
				new HashMap<Integer,Integer>();
		for (int i =0; i < 10000; i++){
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		int max = m.get(0);
		int maxKey = 0;
		for(int i = 1; i < 20; i++){
			if (m.get(i) > max){ 
				max = m.get(i);
				maxKey = i;
			}
		}
		//System.out.println(m);
		return maxKey;
	}
}
