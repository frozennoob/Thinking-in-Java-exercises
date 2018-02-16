import java.util.*;
import net.mindview.util.TextFile;

public class Ex16 {
	public static void start(){
		List<String> words = new ArrayList<String>(
				new TextFile("src\\Ex15.java", "\\W+"));
		System.out.println(words);
		Set<Character> al = new HashSet<Character>(Arrays.asList(
				'a', 'e', 'y', 'u', 'i', 'o'));
		Iterator<String> is = words.iterator();
		Iterator<Character> ic = al.iterator();
		int [] n = new int[words.size()];
		int word = 0;
		while(is.hasNext()){
			String w = is.next().toLowerCase();
			for (int i = 0; i < w.length(); i++){
				char ch = w.charAt(i);
				while(ic.hasNext())
					if (ic.next().equals(ch))
						n[word]++;
				ic = al.iterator();
					
			}
			word++;
		}
		int sum = 0;
		for (int i : n){
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println("\n" + "Sum: " + sum);
	}
}
