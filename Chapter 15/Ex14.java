import java.util.*;
import net.mindview.util.*;

public class Ex14 {
	public static void start(){
		net.mindview.util.Generator<CountedObject> gen = 
				new BasicGenerator<CountedObject>(CountedObject.class);
		for (int i = 0; i < 5; i ++)
			System.out.println(gen.next());
	}
}
