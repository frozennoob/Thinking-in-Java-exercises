import java.util.*;
public class Ex26{
	public static void start(){
		Map<CountedString,Integer> map =
			      new HashMap<CountedString,Integer>();
			    CountedString[] cs = new CountedString[5];
			    for(int i = 0; i < cs.length; i++) {
			      cs[i] = new CountedString("hi", 'h');
			      map.put(cs[i], i); // Autobox int -> Integer
			    }
			    System.out.println(map);
			    for(CountedString cstring : cs) {
			      System.out.println("Looking up " + cstring);
			      System.out.println(map.get(cstring));
			    }
	}
}