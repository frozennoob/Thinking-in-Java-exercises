import java.util.*;

public class Ex2 {
	public static void start(){
		Set<Integer> c = new LinkedHashSet<Integer>();
		for (int i = 0; i < 10; i++)
			c.add(i);
		for(Integer i :c)
			System.out.print(i + ", ");
		System.out.println();
	}
}
