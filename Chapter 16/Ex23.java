import java.util.*;
import net.mindview.util.*;

public class Ex23 {
	public static void start(){
		Random rnd = new Random(47);
		Integer a[] = new Integer[5];
		for (int i = 0; i < a.length; i ++)
			a[i] = rnd.nextInt();
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}
