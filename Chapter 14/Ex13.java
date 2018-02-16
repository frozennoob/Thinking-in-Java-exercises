import java.util.*;

public class Ex13 {
	public static void start(){
		Part.createRandom();
		FactoryCount.countFactory(new Part());
	}
}
interface IFactory<T> { T create(); }
class Part {
	
	public String toString() {
	    return getClass().getSimpleName();
	  }
	  static List<IFactory<? extends Part>> partFactories =
	    new ArrayList<IFactory<? extends Part>>();	
	  static {
	    // Collections.addAll() gives an "unchecked generic
	    // array creation ... for varargs parameter" warning.
	    partFactories.add(new FuelFilter.Factory());
	    partFactories.add(new AirFilter.Factory());
	    partFactories.add(new CabinAirFilter.Factory());
	    partFactories.add(new OilFilter.Factory());
	    partFactories.add(new FanBelt.Factory());
	    partFactories.add(new PowerSteeringBelt.Factory());
	    partFactories.add(new GeneratorBelt.Factory());
	  }
	  private static Random rand = new Random(47);
	  public static Part createRandom() {
	    int n = rand.nextInt(partFactories.size());
	    return partFactories.get(n).create();
	  }
	}	

	class Filter extends Part {}

	class FuelFilter extends Filter {
	  // Create a Class Factory for each specific type:
	  public static class Factory
	  implements IFactory<FuelFilter> {
	    public FuelFilter create() { return new FuelFilter(); }
	  }
	}

	class AirFilter extends Filter {
	  public static class Factory
	  implements IFactory<AirFilter> {
	    public AirFilter create() { return new AirFilter(); }
	  }
	}	

	class CabinAirFilter extends Filter {
	  public static class Factory
	  implements IFactory<CabinAirFilter> {
	    public CabinAirFilter create() {
	      return new CabinAirFilter();
	    }
	  }
	}

	class OilFilter extends Filter {
	  public static class Factory
	  implements IFactory<OilFilter> {
	    public OilFilter create() { return new OilFilter(); }
	  }
	}	

	class Belt extends Part {}

	class FanBelt extends Belt {
	  public static class Factory
	  implements IFactory<FanBelt> {
	    public FanBelt create() { return new FanBelt(); }
	  }
	}

	class GeneratorBelt extends Belt {
	  public static class Factory
	  implements IFactory<GeneratorBelt> {
	    public GeneratorBelt create() {
	      return new GeneratorBelt();
	    }
	  }
	}	

	class PowerSteeringBelt extends Belt {
	  public static class Factory
	  implements IFactory<PowerSteeringBelt> {
	    public PowerSteeringBelt create() {
	      return new PowerSteeringBelt();
	    }
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
		  countFactory(Part creator) {
		    FactoryCounter counter= new FactoryCounter();
		    for(IFactory<? extends Part> pet : creator.partFactories) {
		      // List each individual pet:
		      System.out.println(pet.getClass().getDeclaringClass().getSimpleName() + " ");
		      if(pet.create() instanceof Part)
		        counter.count("Part");
		      if(pet.create() instanceof Filter)
		        counter.count("Filter");
		      if(pet.create() instanceof AirFilter)
		        counter.count("AirFilter");
		      if(pet.create() instanceof FuelFilter)
		        counter.count("FuelFilter");
		      if(pet.create() instanceof CabinAirFilter)
		        counter.count("CabinAirFilter");
		      if(pet.create() instanceof OilFilter)
			        counter.count("OilFilter");
		      if(pet.create() instanceof Belt)
			        counter.count("Belt");
		      if(pet.create() instanceof FanBelt)
			        counter.count("FanBelt");
		      if(pet.create() instanceof GeneratorBelt)
			        counter.count("GeneratorBelt");
		      if(pet.create() instanceof PowerSteeringBelt)
			        counter.count("PowerSteeringBelt");
		    }
		    // Show the counts:
		    System.out.println();
		    System.out.println(counter);
		  }	
		}