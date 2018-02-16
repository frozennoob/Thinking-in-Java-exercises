package typeinfo.pets;

import java.util.HashMap;

public class PetCount5 {
	public static void main(String[] args){
		System.out.println("----------PetCount5----------");
		PetCreator2.createRandom();
		FactoryCount.countFactory(new PetCreator2());
		System.out.println("----------PetCount5 finished----------");
	}
}

class FactoryCount {
	  static class FactoryCounter extends HashMap<String,Integer> {
	    public void count(String type) {
	      Integer quantity = get(type);
	      if(quantity == null)
	        put(type, 1);
	      else
	        put(type, quantity + 1);
	    }
	  }	
	  public static void
	  countFactory(PetCreator2 creator) {
	    FactoryCounter counter= new FactoryCounter();
	    for(PFactory<? extends Pet> pet : creator.partFactories) {
	      // List each individual pet:
	      System.out.println(pet.getClass().getDeclaringClass().getSimpleName() + " ");
	      if(pet.create() instanceof Cat)
	        counter.count("Cat");
	      if(pet.create() instanceof Cymric)
	        counter.count("Cymric");
	      if(pet.create() instanceof Dog)
	        counter.count("Dog");
	      if(pet.create() instanceof EgyptianMau)
	        counter.count("EgyptianMau");
	      if(pet.create() instanceof Gerbil)
	        counter.count("Gerbil");
	      if(pet.create() instanceof Hamster)
		        counter.count("Hamster");
	      if(pet.create() instanceof Manx)
		        counter.count("Manx");
	      if(pet.create() instanceof Mouse)
		        counter.count("Mouse");
	      if(pet.create() instanceof Mutt)
		        counter.count("Mutt");
	      if(pet.create() instanceof Pug)
		        counter.count("Pug");
	      if(pet.create() instanceof Rat)
		        counter.count("Rat");
	      if(pet.create() instanceof Rodent)
		        counter.count("Rodent");
	    }
	    // Show the counts:
	    System.out.println();
	    System.out.println(counter);
	  }	
	}