//: containers/SimpleHashMap.java
// A demonstration hashed Map.
import java.util.*;
import net.mindview.util.*;

public class SimpleHashMap<K,V> extends AbstractMap<K,V> {
  // Choose a prime number for the hash table
  // size, to achieve a uniform distribution:
  static final int SIZE = 997;
  // You can't have a physical array of generics,
  // but you can upcast to one:
  @SuppressWarnings("unchecked")
  LinkedList<MapEntry<K,V>>[] buckets =
    new LinkedList[SIZE];
  public V put(K key, V value) {
    V oldValue = null;
    int index = Math.abs(key.hashCode()) % SIZE;
    if(buckets[index] == null)
      buckets[index] = new LinkedList<MapEntry<K,V>>();
    LinkedList<MapEntry<K,V>> bucket = buckets[index];
    MapEntry<K,V> pair = new MapEntry<K,V>(key, value);
    boolean found = false;
    ListIterator<MapEntry<K,V>> it = bucket.listIterator();
    int probes = 0;
	while(it.hasNext()) {
		MapEntry<K,V> iPair = it.next();
		probes++;
		if(iPair.getKey().equals(key)) {
			oldValue = iPair.getValue();
			it.set(pair); // Replace old with new
			found = true;
			System.out.println("Collision at " + 
				iPair + ": " + probes + " probe" 
				+ ((probes == 1) ? "" : "s") +
				" needed");
			break;
		}
	}	
    if(!found)
      buckets[index].add(pair);
    return oldValue;
  }
  public V get(Object key) {
    int index = Math.abs(key.hashCode()) % SIZE;
    if(buckets[index] == null) return null;
    for(MapEntry<K,V> iPair : buckets[index])
      if(iPair.getKey().equals(key))
        return iPair.getValue();
    return null;
  }
  public Set<Map.Entry<K,V>> entrySet() {
    Set<Map.Entry<K,V>> set= new HashSet<Map.Entry<K,V>>();
    for(LinkedList<MapEntry<K,V>> bucket : buckets) {
      if(bucket == null) continue;
      for(MapEntry<K,V> mpair : bucket)
        set.add(mpair);
    }
    return set;
  }
  public V remove(Object key){
	  int index = Math.abs(key.hashCode()) % SIZE;
	    if(buckets[index] == null) return null;
	    for(MapEntry<K,V> iPair : buckets[index])
	        if(iPair.getKey().equals(key)){
	          buckets[index].remove(iPair);
	          return iPair.getValue();
	        }
	      return null; 
  }
  public void clear(){
	  for(LinkedList<MapEntry<K,V>> bucket : buckets) {
		 if(bucket == null) continue;
		  bucket.clear();
	  }
  }
  public boolean containsKey(Object key){
	  int index = Math.abs(key.hashCode()) % SIZE;
	    if(buckets[index] == null) return false;
	    for(MapEntry<K,V> iPair : buckets[index])
	      if(iPair.getKey().equals(key))
	        return true;
	    return false;
	  
  }
  public boolean containsValue(Object value){
	    for (LinkedList<MapEntry<K,V>> bl : buckets){
	    	if (bl == null) continue;
		    for(MapEntry<K,V> iPair : bl)
		      if(iPair.getValue().equals(value))
		        return true;
	    }
	    return false;
	  
  }
  public boolean equals(Object o){
	  try{
	  Iterator it = entrySet().iterator();
	  Iterator io = ((SimpleHashMap)o).entrySet().iterator();
	  while(it.hasNext())
		  if (!(it.next().equals(io.next())))
			  return false;
	return true;
	  }catch (Exception e){
		  return false;
	  }
	  
  }
  public boolean isEmpty(){
	if (entrySet().isEmpty())
		return true;
	return false;
	  
  }
  public int size(){
	  int size = 0;
	for (Entry<K,V> e : entrySet())
		size++;
	return size;
  }
  public String toString(){
	return entrySet().toString();
	  
  }
  
}