import java.util.*;

public class Ex11 {
	public static void start(){
		List<String> str1 = new ArrayList<String>(Arrays.asList(
				"for", "to", "at", "on"));
		List<String> str2 = new LinkedList<String>(Arrays.asList(
				"for", "to", "at", "on"));
		display(str1.iterator());
		System.out.println();
		display(str2.iterator());
	}
	static void display(Iterator<String> it){
		while(it.hasNext()){
			String g = it.next();
			System.out.print(g + " ");
		}
	}
}
