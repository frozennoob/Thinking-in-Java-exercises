import java.util.*;

public class Ex20 {
	public static void start(){
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		for (int i = 0; i < 3; i++){
			Arrays.fill(a[i], i);
			Arrays.fill(b[i], i);
		}
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));
		System.out.println(Arrays.deepEquals(a, b));
	}
}
