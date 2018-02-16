//p.710
import java.util.*;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;
import static net.mindview.util.Print.*;
public class Ex40{
	public static void start(){
		final int SIZE = 20;
		List<TwoStrings> lts = new ArrayList<TwoStrings>();
		TwoStrings[] ts = new TwoStrings[SIZE];
		ts = Generated.array(TwoStrings.class, 
				new TwoStringsGenerator(), SIZE);
		lts.addAll(Arrays.asList(ts));
		TwoStrings tws = lts.get(5);
		System.out.println(tws);
		System.out.println(lts);
		Collections.sort(lts);
		System.out.println(lts);
		Collections.sort(lts, new TwoStringsComparator());
		System.out.println(lts);
		System.out.println(Collections.binarySearch(
				lts, tws, new TwoStringsComparator()));
		HashSet<TwoStrings> hsts = new HashSet<TwoStrings>();
		hsts.addAll(Arrays.asList(ts));
		System.out.println(hsts);
		TwoStrings41.start();
	}
}

class TwoStringsComparator implements Comparator<TwoStrings>{

	@Override
	public int compare(TwoStrings o1, TwoStrings o2) {
		return o1.getStrTwo().compareTo(o2.getStrTwo());
	}
	
}
class TwoStringsGenerator implements Generator{
	public TwoStrings next(){
		return new TwoStrings(new RandomGenerator.String().next(), 
				new RandomGenerator.String().next());
	}
}

class TwoStrings implements Comparable <TwoStrings>{
	private String strOne;
	private String strTwo;
	public TwoStrings(String strOne, String strTwo) {
		this.strOne = strOne;
		this.strTwo = strTwo;
	}
	public String getStrOne() {
		return strOne;
	}
	public String getStrTwo() {
		return strTwo;
	}
	@Override
	public int compareTo(TwoStrings o) {
		return getStrOne().compareTo(o.getStrOne());
	}
	public String toString(){
		return "{" + strOne + ", " + strTwo + "}";
	}
	public int hashCode() { // field second is not involved
        int result = 17;
        result = result * 31 + strOne.hashCode();
        return result;
    }
}
class TwoStrings41 implements Comparable<TwoStrings41> {
	private String first = "";
	private String second = "";
	public TwoStrings41(String s1, String s2) {
		first = s1;
		second = s2;
	}
	// Using only first String to compare:
	public int compareTo(TwoStrings41 ts) {
		return first.compareTo(ts.first);
	}
	// Optional inner class to use second String to compare:
	public static class Comp2 implements Comparator<TwoStrings41> {
		public int compare(TwoStrings41 ts1, TwoStrings41 ts2) {
			return ts1.second.compareTo(ts2.second);
		}
	}
	public String toString() {
		return first + " & " + second;
	}
	static void printArray(TwoStrings41[] sa) {
		printnb("(");
		for(int i = 0; i < sa.length - 1; i++) 
			printnb(sa[i] + ", ");
		print(sa[sa.length - 1] + ")");		
	}
	public static void start() {
		RandomGenerator.String rgs = new RandomGenerator.String(4);
		RandomGenerator.Integer rgi = new RandomGenerator.Integer(100);
		Set<TwoStrings> set = new HashSet<TwoStrings>();
		Map<TwoStrings,Integer> map = new HashMap<TwoStrings,Integer>();
		for(int i = 0; i < 4; i++) {
			String s1 = rgs.next();
			String s2 = rgs.next();
			set.add(new TwoStrings(s1, s2));
			map.put(new TwoStrings(s1, s2), rgi.next());
		}
		print("Set: " + set);
		print("Map: " + map);
		print("map.keySet(): " + map.keySet());
		print("Sorted by first String:");
		Set<TwoStrings> treeSet = new TreeSet<TwoStrings>(set);
		Map<TwoStrings,Integer> treeMap = 
			new TreeMap<TwoStrings,Integer>(map);
		print("TreeSet: " + treeSet);
		print("TreeMap: " + treeMap);
		print("Sorted by second String:");	
	}
}