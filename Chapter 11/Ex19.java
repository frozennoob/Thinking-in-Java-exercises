import java.util.*;

public class Ex19 {
	public static void start(){
		Set<Integer> s = new HashSet<Integer>(Arrays.asList(
				113,2123,342,411,544,6));
		System.out.println(s);
		int [] n = new int[s.size()];
		Iterator<Integer> ii = s.iterator();
		for(int i = 0; i < s.size(); i ++)
			n[i] = ii.next();
		for(int i = 0; i < n.length - 1; i++)
			for(int j = i + 1; j < n.length; j++)
				if(n[i] > n[j]){
					int temp = n[j];
					n[j] = n[i];
					n[i] = temp;
				}
		Set<Integer> ls = new LinkedHashSet();
		for (int i = 0; i < n.length; i++)
			ls.add(n[i]);
		
		System.out.println(ls);	
	}
}
