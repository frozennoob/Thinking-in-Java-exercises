
import java.util.*;

public class Ex17 {
	public static void start(){
		Map<String, Gerbil> gerbil = new HashMap<String, Gerbil>();
		gerbil.put("Mashka", new Gerbil());
		gerbil.put("Dashka", new Gerbil(1));
		gerbil.put("Natashka", new Gerbil(2));
		gerbil.put("Vasyka", new Gerbil(3));
		gerbil.put("Pashka", new Gerbil(4));
		Iterator<String> is = gerbil.keySet().iterator();
		while(is.hasNext()){
			String g = is.next();
			System.out.print(g + " ");
			gerbil.get(g).hop();
		}
	}
}
class Gerbil {
	private int gerbilNumber;
	Gerbil(int x){
		gerbilNumber = x;
	}
	Gerbil(){
		gerbilNumber = 0;
	}
	public void hop(){
		System.out.println("gerbilNubmer = " + gerbilNumber);
	}
}