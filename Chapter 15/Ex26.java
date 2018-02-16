import java.util.*;

public class Ex26 {
	public static void start(){
		Number[] n = new Number[3];
		Integer[] i = {1,2,3};
		n = i;
		for (Number k : n)
			System.out.print(k + ", ");
	}
}
