import java.util.*;

public class Ex12 {
	public static void start(){
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		ListIterator<Integer> ita = a.listIterator();
		ListIterator<Integer> itb = b.listIterator(5);
		
		while(ita.hasNext()){
			itb.previous();
			itb.set(ita.next());
		}
		while (itb.hasNext())
		System.out.print(itb.next() + " ");
	}	
}
