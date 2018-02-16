package generics.coffee;

import java.util.HashMap;

public class CoffeeCount {
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
	  countCoffee(CoffeeGenerator creator) {
	    CoffeeCounter counter= new CoffeeCounter();
	    for(Coffee pet : creator) {
	      // List each individual pet:
	      System.out.println(pet.getClass().getSimpleName() + " ");
	      if(pet instanceof Coffee)
	        counter.count("Coffee");
	      if(pet instanceof Breve)
	        counter.count("Breeve");
	      if(pet instanceof Cappuccino)
	        counter.count("Cappuccino");
	      if(pet instanceof Latte)
	        counter.count("Latte");
	      if(pet instanceof Mocha)
	        counter.count("Mocha");
	    }
	    // Show the counts:
	    System.out.println();
	    System.out.println(counter);
	  }	
	  public static void main(String[] args) {
	    countCoffee(new CoffeeGenerator(20));
	  }
	}