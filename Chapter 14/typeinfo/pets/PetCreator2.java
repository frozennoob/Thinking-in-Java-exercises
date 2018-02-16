package typeinfo.pets;
import java.util.*;

interface PFactory<T> { T create(); }
public class PetCreator2 {
	static List<PFactory<? extends Pet>> partFactories =
		    new ArrayList<PFactory<? extends Pet>>();	
		  static {
		    // Collections.addAll() gives an "unchecked generic
		    // array creation ... for varargs parameter" warning.
		    partFactories.add(new Cat.Factory());
		    partFactories.add(new Cymric.Factory());
		    partFactories.add(new Dog.Factory());
		    partFactories.add(new EgyptianMau.Factory());
		    partFactories.add(new Gerbil.Factory());
		    partFactories.add(new Hamster.Factory());
		    partFactories.add(new Manx.Factory());
		    partFactories.add(new Mouse.Factory());
		    partFactories.add(new Mutt.Factory());
		    partFactories.add(new Pug.Factory());
		    partFactories.add(new Rat.Factory());
		    partFactories.add(new Rodent.Factory());
		  }
		  private static Random rand = new Random(47);
		  public static Pet createRandom() {
		    int n = rand.nextInt(partFactories.size());
		    return partFactories.get(n).create();
		  }
}

