import java.util.*;
import java.util.Map.Entry;

import net.mindview.util.TextFile;

public class Ex21 {
	public static void start(){
		List<String> words = new ArrayList<String>(
				new TextFile("src\\Ex20.java", "\\W+"));
		System.out.println(words);
		Map<String, Integer> al = new HashMap<String, Integer>();
		Iterator<String> is = words.iterator();
		while(is.hasNext()){
			String w = is.next().toLowerCase();
			if (al.containsKey(w))
				for(Entry<String,Integer> entry : al.entrySet())
				if (entry.getKey().equals(w))
					entry.setValue(entry.getValue() + 1);
			if(!al.containsKey(w))
				al.put(w, 1);
		}	
		List<String> list = new ArrayList(al.keySet());
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		Map<String, Integer> al2 = new LinkedHashMap<String, Integer>();
		for (String l : list)
			for(Entry<String,Integer> entry : al.entrySet())
				if (entry.getKey().equals(l))
					System.out.print(entry + ", ");
	}
}
