package generics.coffee;

import java.util.HashMap;

public class CoffeeCount2 {

	public static void main(String[] args) {
		System.out.println("-------Coffee Count 2-------");
		Coffee.createRandom();
		CoffeeCount2.countFactory(new Coffee());

	}
	static class CoffeeCounter extends HashMap<String,Integer> {
	    public void count(String type) {
	      Integer quantity = get(type);
	      if(quantity == null)
	        put(type, 1);
	      else
	        put(type, quantity + 1);
	    }
	  }	
	  public static void
	  countFactory(Coffee creator) {
	    CoffeeCounter counter= new CoffeeCounter();
	    for(CFactory<? extends Coffee> pet : creator.partFactories) {
	      // List each individual pet:
	      System.out.println(pet.getClass().getDeclaringClass().getSimpleName() + " ");
	      if(pet.create() instanceof Coffee)
	        counter.count("Coffee");
	      if(pet.create() instanceof Americano)
	        counter.count("Americano");
	      if(pet.create() instanceof Breve)
	        counter.count("Breve");
	      if(pet.create() instanceof Cappuccino)
	        counter.count("Cappuccino");
	      if(pet.create() instanceof Latte)
	        counter.count("Latte");
	      if(pet.create() instanceof Mocha)
		        counter.count("Mocha");
	    }
	    // Show the counts:
	    System.out.println();
	    System.out.println(counter);
	  }
}
