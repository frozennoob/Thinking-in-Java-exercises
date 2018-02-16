//стр 633
import java.util.*;

public class Ex22 {
	public static void start(){
		int [] a = {1,3,2,5,10,1,4};
		System.out.println(Arrays.binarySearch(a, 2));
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 2));
	}
}
