import java.util.*;

public class Ex4 {
	public static void start(){
		String charStr[] = new String[10];
		ArrayList<String> charAL = new ArrayList<String>();
		LinkedList<String> charLL = new LinkedList<String>();
		HashSet<String> charHS = new HashSet<String>();
		LinkedHashSet<String> charLH = new LinkedHashSet<String>();
		TreeSet<String> charTS = new TreeSet<String>();
		FilmChars fc = new FilmChars();
		for (int i = 0; i < 10; i++){
			charStr[i] = fc.next();
			charAL.add(fc.next());
			charLL.add(fc.next());
			charHS.add(fc.next());
			charLH.add(fc.next());
			charTS.add(fc.next());
		}
		System.out.println("charStr:");
		for (int i = 0; i < 10; i++){
			System.out.print(charStr[i] + " ");
		}
		System.out.println();
		System.out.println("charAL:");
		for (String i : charAL){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("charLL:");
		for (String i : charLL){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("charHS:");
		for (String i : charHS){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("charLH:");
		for (String i : charLH){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("charTS:");
		for (String i : charTS){
			System.out.print(i + " ");
		}
	}
}

class FilmChars{
	private String[] chars = new String[]{
			"Пьер", "Наташа", "Андрей", "Марья", "Николай"
	}; 
	private int next = 0;
	public String next(){
		if (next < chars.length) return chars[next++];
		next = 0;
		return chars[next++];
	}
}