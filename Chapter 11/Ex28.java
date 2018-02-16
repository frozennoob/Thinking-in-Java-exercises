import java.util.*;

public class Ex28 {
	public static void start(){
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		Random rand = new Random(47);
		for (int i = 0; i < 100; i++){
			pq.offer(rand.nextDouble());
		}
		System.out.println(pq);
		while (!pq.isEmpty())
			System.out.print(pq.poll() + " ");
	}
}
