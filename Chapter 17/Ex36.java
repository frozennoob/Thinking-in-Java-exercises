//p.705
import java.util.*;
public class Ex36{
	public static void start(){
		SlowMap36<Integer, Integer> m = new SlowMap36<Integer, Integer>();
		m.put(2, 12);
		m.put(3, 13);
		m.put(4, 14);
		System.out.println(m.entrySet());
		m.put(4, 15);
		System.out.println(m.entrySet());
		System.out.println(m.get(4));
		MapPerformance36.start();
	}
}

class MapPerformance36 extends MapPerformance{
	public static void start() {
		String[] args = new String[]{"10","250", "50" , "250", "100", "250"};
		//String[] args = null;
		MapPerformance.start(args);
	    Tester.run(new SlowMap36<Integer,Integer>(), tests);
	  }
}

class SlowMap36<K, V> extends AbstractMap<K, V>{
	private List<MapEntry36<K,V>> map = new ArrayList<MapEntry36<K,V>>();
	
	public V put(K key, V value) {
		V oldValue = get(key); // The old value or null
		for (int i = 0; i < map.size(); i++)
			if (map.get(i).getKey() == key){
				map.get(i).setValue(value);
				return oldValue;
			}
		map.add(new MapEntry36<K,V>(key,value));
		Collections.sort(map);
		return oldValue;
	}
	
	public boolean containsKey(Object key){
		for (MapEntry36<K,V> m : map)
			if (m.getKey() == key)
				return true;
		return false;
	}
	
	public V get(Object key) { // key is type Object, not K
		int index = Collections.binarySearch(map, new MapEntry36<K,V>((K) key,null));
		if (index < 0)
			return null;
		return map.get(index).getValue(); 
	}

	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		for (MapEntry36<K,V> m : map)
			set.add(m);
		return set;
	}
}

class MapEntry36<K,V> extends MapEntry<K,V> implements Comparable<MapEntry<K,V>>{

	public MapEntry36(K key, V value) {
		super(key, value);
	}

	@Override
	public int compareTo(MapEntry<K, V> o) {
		return getKey().hashCode() - o.getKey().hashCode();
	}


	
}