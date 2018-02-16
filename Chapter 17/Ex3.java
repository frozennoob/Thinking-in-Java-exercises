import java.util.*;
import net.mindview.util.*;

public class Ex3 {
	public static void start(){
		String filename = "src\\Ex2.java";
		List<String> l = new LinkedList<String>(CollectionInitializer.init(filename));
		System.out.println(l);
	}
}
