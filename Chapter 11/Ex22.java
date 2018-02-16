import java.util.*;
import java.util.Map.Entry;
import net.mindview.util.TextFile;

public class Ex22 {
	public static void start(){
		List<String> words = new LinkedList<String>(
				new TextFile("src\\Ex20.java", "\\W+"));
		Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
		System.out.println(words);
		Iterator<String> is = words.iterator();
		Set<Words> w = new LinkedHashSet<Words>();
		//Iterator<Words> iw = w.iterator();
		for (String str: words)
			if (!contains(w,str.toLowerCase()))
				w.add(new Words(str.toLowerCase()));
		System.out.println();
		for (Words tmp: w)
			System.out.print(tmp.getWord() + " = " + tmp.getVal() + ", ");
	}
	static boolean contains(Set<Words> w, String s){
		for (Words tmp: w){
			if (tmp.getWord().equals(s)) {
				tmp.iterate();
				return true;
			}
		}
		return false;
	}
}

class Words {
	private final String word;
	private int val = 1;
	Words(String w){
		word = w;
	}
	public String getWord(){
		return word;
	}
	public void iterate(){
		val++;
	}
	public int getVal(){
		return val;
	}
}