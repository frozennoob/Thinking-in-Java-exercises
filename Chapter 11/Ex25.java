import java.util.*;

import net.mindview.util.TextFile;

public class Ex25 {
	public static void start(){
		List<String> words = new ArrayList<String>(
				new TextFile("src\\Ex20.java", "\\W+"));
		Map<String, ArrayList<Integer>> m = 
				new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < words.size(); i ++){
			m.put(words.get(i), 
					m.get(words.get(i)) == null ? 
							new ArrayList<Integer>(Arrays.asList(i)) :
					add(m.get(words.get(i)), i));	
		}
		System.out.println(m);
		List<String> toBegin = new ArrayList<String>();
		for (String i : m.keySet())
			for (int j : m.get(i))
				toBegin.add(" ");
		for (String i : m.keySet())
			for (int j : m.get(i))
				toBegin.set(j, i);
		System.out.println(toBegin);
	}
	static ArrayList<Integer> add(ArrayList<Integer> list, int val){
		list.add(val);
		return list;
	}
}
