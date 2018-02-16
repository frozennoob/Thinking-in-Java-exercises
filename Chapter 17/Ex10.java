import java.util.*;
//page 665
public class Ex10 {
	public static void start(){
		SortSet<String> ss = new SortSet<String>();
		ss.addAll(Arrays.asList("Bros", "Anur" , "Joke", "Zorro", "Her", "Her"));
		System.out.println(ss);
		SortedSet<String> s = new TreeSet<String>();
	}
}

class SortSet<E> extends LinkedList<E> {
	public boolean add(E e){
		if (contains(e)) return false;
		return super.add(e);
	}
	 public boolean addAll(Collection<? extends E> c) {
		 for (E i : c)
			this.add(i);
		 return true;
	 }
	public String toString(){
		Collections.sort((List)this);
		return super.toString();
	}
}