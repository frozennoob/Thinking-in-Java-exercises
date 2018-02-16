import java.util.*;
import net.mindview.util.*;

public class Ex13 {
	public static void start(){
		String str = Arrays.toString(Generated.array(Character.class, 
				new CountingGenerator.Character(), 10));
		System.out.println(str);
	}
}
