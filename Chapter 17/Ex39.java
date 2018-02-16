import java.util.*;
public class Ex39{
	public static void start(){
		SimpleHashMap39<Integer,Integer> shm = new SimpleHashMap39<Integer,Integer>();
		for (int i = 0 ; i < 1000; i++)
			shm.put(i, i*100 + i);
		System.out.println(shm.capacity());
	}
}

class Prime {
	public static int firstPrimeAfter(int n) {
		for(int i = n + 1; i > n; i++) {
			int factors = 0;
			for(int j = 1; j < (i + 2)/2; j++) {
				if((i % j) == 0) factors++;
			}
			if(factors < 2) return i;
		}
		return 0;
	}
}

class SimpleHashMap39<K,V> extends SimpleHashMap<K,V>{
	private int capacity = SIZE;
	
	private void rehash(){
		capacity = Prime.firstPrimeAfter(capacity() * 2);
		LinkedList<MapEntry<K,V>>[] oldBuckets = buckets;		
		buckets = new LinkedList[capacity];
		for(LinkedList<MapEntry<K,V>> bucket : oldBuckets) {
			if(bucket == null) continue;
			for(MapEntry<K,V> mpair : bucket)
				this.put(mpair.getKey(), mpair.getValue());
		}
	}
	
	public int capacity(){
		return capacity;
	}
	
	public V put(K key, V value) {
		if ((size() / capacity()) > 0.75)
			rehash();
		return super.put(key, value);
	}
}