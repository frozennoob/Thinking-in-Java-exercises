import java.util.*;
import net.mindview.util.*;

public class Ex12 {
	public static void start(){
		double [] a = ConvertTo.primitive(Generated.array(Double.class, 
				new CountingGenerator.Double(), 10));
		System.out.println(Arrays.toString(a));
	}
}
