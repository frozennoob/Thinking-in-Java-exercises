import java.util.*;

public class Ex2 {
	public static void start(){
		List<InfiniteRecursion> v  =
				new ArrayList<InfiniteRecursion>();
		for(int i = 0; i< 10; i++)
			v.add(new InfiniteRecursion());
		System.out.println(v);	
	}
}

class InfiniteRecursion {
	public String toString() {
		return "InfiniteRecursion address: " + super.toString() + "\n";
	}
}