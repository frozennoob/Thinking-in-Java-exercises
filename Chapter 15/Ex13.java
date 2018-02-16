import java.util.*;

public class Ex13 {
	public static <T> Collection<T>
	fill(Collection<T> coll, Generator<T> gen, int n){
		for (int i = 0; i < n; i ++)
			coll.add(gen.next());
		return coll;
	}
	public static <T> List<T>
	fill(List<T> coll, Generator<T> gen, int n){
		for (int i = 0; i < n; i ++)
			coll.add(gen.next());
		return coll;
	}
	public static <T> Queue<T>
	fill(Queue<T> coll, Generator<T> gen, int n){
		for (int i = 0; i < n; i ++)
			coll.add(gen.next());
		return coll;
	}
	public static <T> Set<T>
	fill(Set<T> coll, Generator<T> gen, int n){
		for (int i = 0; i < n; i ++)
			coll.add(gen.next());
		return coll;
	}
	public static <T> LinkedList<T>
	fill(LinkedList<T> coll, Generator<T> gen, int n){
		for (int i = 0; i < n; i ++)
			coll.add(gen.next());
		return coll;
	}
	public static void start(){
		Collection<Integer> fnumbers = fill(
				new ArrayList<Integer>(), new Fibonacci(), 12);
		for(int i : fnumbers)
			System.out.print(i + ", ");
		List<Integer> fnumbers2 = fill(
				new ArrayList<Integer>(), new Fibonacci(), 12);
		for(int i : fnumbers)
			System.out.print(i + ", ");
		LinkedList<Integer> fnumbers3 = fill(
				new LinkedList<Integer>(), new Fibonacci(), 12);
		for(int i : fnumbers)
			System.out.print(i + ", ");
	}
}
