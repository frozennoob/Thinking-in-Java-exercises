import java.util.*;

public class SlowSet<K> extends AbstractSet<K> {
	private List<K> set = new ArrayList<K>();
	@Override
	public boolean add(K val){
		if (set.contains(val))
			return false;
		set.add(val);
		return true;
		
	}
	public Iterator<K> iterator() {
		return set.iterator();
	}

	@Override
	public int size() {
		return set.size();
	}

}