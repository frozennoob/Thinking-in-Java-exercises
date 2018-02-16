import java.util.*;

import net.mindview.util.TextFile;
public class Ex13 {
	public static void start(){
		final String FILENAME = "src\\Ex12.java";
		Set<String> words = new TreeSet<String>(new TextFile(FILENAME, "\\W+"));
		AssociativeArray<String,Integer> wordCount =
				new AssociativeArray<String,Integer>(words.size());
		ArrayList<String> fileList = new TextFile(FILENAME, "\\W+");
		for(String s : words) {
			int count = 0;
			for(String t : fileList) {
				if(t.equals(s)) count++;
			}
			wordCount.put(s, count);
		}
		System.out.println(wordCount);
		
	}
}

