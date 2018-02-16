import java.util.*;
import java.util.Map.Entry;

import net.mindview.util.TextFile;

public class Ex20 {
	public static void start(){
		List<String> words = new ArrayList<String>(
				new TextFile("src\\Ex15.java", "\\W+"));
		System.out.println(words);
		Map<Character, Integer> al = new HashMap<Character, Integer>();
		al.put('a', 0);
		al.put('e', 0);
		al.put('y', 0);
		al.put('u', 0);
		al.put('i', 0);
		al.put('o', 0);
		Iterator<String> is = words.iterator();
		int [] n = new int[words.size()];
		int word = 0;
		while(is.hasNext()){
			String w = is.next().toLowerCase();
			for (int i = 0; i < w.length(); i++){
				char ch = w.charAt(i);
				for(Entry<Character,Integer> entry : al.entrySet())
					if (entry.getKey().equals(ch)){
						entry.setValue(entry.getValue() + 1);
						n[word]++;
					}							
			}
			word++;
		}
		int sum = 0;
		for (int i : n){
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println("\n" + "Sum: " + sum);
		System.out.println(al);
	}
}
