import java.util.*;
import generics.coffee.*;

public class Ex35 {
	@SuppressWarnings("unchecked")
	  static void oldStyleMethod(List probablyDogs) {
	    probablyDogs.add(new Latte());
	  }	
	public static void start(){
		List<Mocha> dogs1 = new ArrayList<Mocha>();
	    oldStyleMethod(dogs1); // Quietly accepts a Cat
	    List<Mocha> dogs2 = Collections.checkedList(
	      new ArrayList<Mocha>(), Mocha.class);
	    try {
	      oldStyleMethod(dogs2); // Throws an exception
	    } catch(Exception e) {
	      System.out.println(e);
	    }
	    // Derived types work fine:
	    List<Coffee> pets = Collections.checkedList(
	      new ArrayList<Coffee>(), Coffee.class);
	    pets.add(new Latte());
	    pets.add(new Mocha());
	}
}