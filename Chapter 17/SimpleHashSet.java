import java.util.*;
import java.util.Map.Entry;

public class SimpleHashSet<E> extends AbstractSet<E> {
	 // Choose a prime number for the hash table
	  // size, to achieve a uniform distribution:
	  static final int SIZE = 997;
	  // You can't have a physical array of generics,
	  // but you can upcast to one:
	  @SuppressWarnings("unchecked")
	  LinkedList<E>[] buckets =
	    new LinkedList[SIZE];
	  public boolean add(E o) {
	    int index = Math.abs(o.hashCode()) % SIZE;
	    if(buckets[index] == null)
	      buckets[index] = new LinkedList<E>();
	    LinkedList<E> bucket = buckets[index];
	    E elem = o;
	    boolean found = false;
	    ListIterator<E> it = bucket.listIterator();
	    int probes = 0;
		while(it.hasNext()) {
			E iElem = it.next();
			probes++;
			if(iElem.equals(o)) {
				it.set(elem); // Replace old with new
				found = true;
				System.out.println("Collision at " + 
					iElem + ": " + probes + " probe" 
					+ ((probes == 1) ? "" : "s") +
					" needed");
				break;
			}
		}	
	    if(!found){
	      buckets[index].add(elem);
	      return true;
	    }
	    return false;
	  }
	  public Set<E> entrySet() {
		    Set<E> set= new HashSet<E>();
		    for(LinkedList<E> bucket : buckets) {
		      if(bucket == null) continue;
		      for(E elem : bucket)
		        set.add(elem);
		    }
		    return set;
		  }
	  public boolean remove(Object o){
		  int index = Math.abs(o.hashCode()) % SIZE;
		    if(buckets[index] == null) return false;
		    for(E iElem : buckets[index])
		        if(iElem.equals(o)){
		          buckets[index].remove(iElem);
		          return true;
		        }
		      return false; 
	  }
	  public void clear(){
		  for(LinkedList<E> bucket : buckets) {
			 if(bucket == null) continue;
			  bucket.clear();
		  }
	  }
	  public boolean contains(Object o){
		  int index = Math.abs(o.hashCode()) % SIZE;
		    if(buckets[index] == null) return false;
		    for(E iElem : buckets[index])
		      if(iElem.equals(o))
		        return true;
		    return false;
		  
	  }
	  
	  public boolean equals(Object o){
		if (entrySet().equals(((SimpleHashSet)o).entrySet()))
				return true;
		return false;
	  }
	  public boolean isEmpty(){
		if (entrySet().isEmpty())
			return true;
		return false;
		  
	  }
	  public int size(){
		  int size = 0;
		for (E e : entrySet())
			size++;
		return size;
	  }
	  public String toString(){
		return entrySet().toString();
		  
	  }
	  
	@Override
	public Iterator<E> iterator() {
		return entrySet().iterator();
	}
	  
	}