import java.util.*;
import net.mindview.util.Countries;

public class Ex21{
	public static void start(){
		SimpleHashMap<String,String> m =
				new SimpleHashMap<String,String>();
			m.putAll(Countries.capitals(10));
			System.out.println(m);
			m.put("EGYPT","Berlin?");
			m.put("EGYPT","Cairo");
			System.out.println(m);
			m.putAll(Countries.capitals(10));
	}
}