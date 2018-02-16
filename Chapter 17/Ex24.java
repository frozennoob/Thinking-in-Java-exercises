import java.util.*;
public class Ex24{
	public static void start(){
		SimpleHashSet<Integer> shs = new SimpleHashSet<Integer>();
		shs.add(1);
		shs.add(2);
		shs.add(3);
		System.out.println(shs.contains(1));
		System.out.println(shs.contains(3));
		System.out.println(shs.contains(5));
		SimpleHashSet<Integer> shs2 = new SimpleHashSet<Integer>();
		shs2.add(1);
		shs2.add(2);
		shs2.add(3);
		System.out.println(shs.equals(shs2));
		shs2.add(5);
		System.out.println(shs.equals(shs2));
		System.out.println(shs.size());
		System.out.println(shs2.size());
		System.out.println(shs);
		System.out.println(shs2);
		System.out.println(shs.isEmpty());
		SimpleHashSet<Integer> shs3 = new SimpleHashSet<Integer>();
		System.out.println(shs3.isEmpty());
	}
}