import java.util.*;

public class Ex7 {
	public static void start(){
		Empty empty[] = new Empty[] {
				new Empty("a"), new Empty("b"), new Empty("c")};
		for (Empty i : empty) System.out.print(i + " ");
		System.out.println();
		List<Empty> emptyList = new ArrayList<Empty>(Arrays.asList(empty));
		for (Empty i : emptyList) System.out.print(i + " ");
		List<Empty> sub = new ArrayList<Empty>(emptyList.subList(1, 3));
		emptyList.removeAll(sub);
		System.out.println();
		for (Empty i : emptyList) System.out.print(i + " ");
	}
}

class Empty{
	final String name;
	Empty(String n){name = n;}
	public String toString(){
		return name;
	}
}
