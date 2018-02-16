import java.util.*;
import net.mindview.util.*;

// стр 651
public class Ex1 {
	public static void start(){
		List<String> cll = new LinkedList<String>();
		List<String> cal = new ArrayList<String>();
		for (int i = 0; i < Countries.DATA.length; i++){
			cll.add(Countries.DATA[i][0]);
			cll.add(Countries.DATA[i][1]);
			cal.add(Countries.DATA[i][0]);
			cal.add(Countries.DATA[i][1]);
		}
		Collections.sort(cll);
		Collections.sort(cal);
		System.out.println(cll);
		System.out.println(cal);
		for (int i = 0; i < 5; i ++){
			Collections.shuffle(cll);
			Collections.shuffle(cal);
			System.out.println(cll);
			System.out.println(cal);
		}
	}
}
