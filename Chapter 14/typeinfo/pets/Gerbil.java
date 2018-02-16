package typeinfo.pets;

import typeinfo.pets.Gerbil.Factory;

public class Gerbil extends Rodent {
	  public Gerbil(String name) { super(name); }
	  public Gerbil() { super(); }
	  public static class Factory
	  implements PFactory<Gerbil> {
	    public Gerbil create() { return new Gerbil(); }
	  }
	}
