import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;

public class Ex19 {
	public static void start(){
		System.out.println("-------Toy2Test.start()-------");
		Class<?> c = Toy2.class;
		Constructor[] ctors = c.getDeclaredConstructors();
		Pattern p = Pattern.compile("\\w+.\\(\\w+\\)");
		Matcher m = null;
		for(Constructor constr : ctors){
			m = p.matcher(constr.toString());
			try{
			if (m.matches()){ 
					Toy2 toy = (Toy2)constr.newInstance(2);
					toy.msg();
				}
				} catch (Exception e){
					e.printStackTrace(System.err);
				}
			m.reset();
			}	
	}
}
class Toy2 {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  Toy2() {}
  Toy2(int i) {}
  void msg(){System.out.println("Created ");}
}
