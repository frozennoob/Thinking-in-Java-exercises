//: generics/coffee/Coffee.java
package generics.coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface CFactory<T>{ T create();}

public class Coffee {
  private static long counter = 0;
  private final long id = counter++;
  public String toString() {
    return getClass().getSimpleName() + " " + id;
  }
  static List<CFactory<? extends Coffee>> partFactories =
		    new ArrayList<CFactory<? extends Coffee>>();	
		  static {
		    // Collections.addAll() gives an "unchecked generic
		    // array creation ... for varargs parameter" warning.
		    partFactories.add(new Americano.Factory());
		    partFactories.add(new Breve.Factory());
		    partFactories.add(new Cappuccino.Factory());
		    partFactories.add(new Latte.Factory());
		    partFactories.add(new Mocha.Factory());
		  }
		  private static Random rand = new Random(47);
		  public static Coffee createRandom() {
		    int n = rand.nextInt(partFactories.size());
		    return partFactories.get(n).create();
		  }
} ///:~
