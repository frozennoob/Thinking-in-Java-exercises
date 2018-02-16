import java.util.*;

public class Ex24 {
	public static void start(){
		for(int i = 0; i < 20; i++)
		      System.out.print (Part3.createRandom() + ", ");
		
	}
}

interface I2Factory<T> { T create(); }
interface Null{}

class Part3 {
	  public String toString() {
	    return getClass().getSimpleName();
	  }
	  static List<I2Factory<? extends Part3>> partFactories =
	    new ArrayList<I2Factory<? extends Part3>>();	
	  static {
	    // Collections.addAll() gives an "unchecked generic
	    // array creation ... for varargs parameter" warning.
	    partFactories.add(new FuelFilter3.Factory());
	    partFactories.add(new AirFilter3.Factory());
	    partFactories.add(new CabinAirFilter3.Factory());
	    partFactories.add(new OilFilter3.Factory());
	    partFactories.add(new FanBelt3.Factory());
	    partFactories.add(new PowerSteeringBelt3.Factory());
	    partFactories.add(new GeneratorBelt3.Factory());
	    partFactories.add(new NullPart3.Factory());
	  }
	  private static Random rand = new Random(47);
	  public static Part3 createRandom() {
	    int n = rand.nextInt(partFactories.size());
	    return partFactories.get(n).create();
	  }
	}	

class NullPart3 extends Part3 implements Null {
	private NullPart3() { super(); }	
	public static final Part3 NULL = new NullPart3();
	public static class Factory implements I2Factory<NullPart3> {
		public NullPart3 create() { return (NullPart3)NULL; }
	}
	public String toString() { return "NULL"; }
}

class Filter3 extends Part3 {}

class FuelFilter3 extends Filter3 {
	  // Create a Class Factory for each specific type:
	  public static class Factory
	  implements I2Factory<FuelFilter3> {
	    public FuelFilter3 create() { return new FuelFilter3(); }
	  }
}

class AirFilter3 extends Filter3 {
	  public static class Factory
	  implements I2Factory<AirFilter3> {
	    public AirFilter3 create() { return new AirFilter3(); }
	  }
}	

class CabinAirFilter3 extends Filter3 {
	  public static class Factory
	  implements I2Factory<CabinAirFilter3> {
	    public CabinAirFilter3 create() {
	      return new CabinAirFilter3();
	    }
	  }
}

class OilFilter3 extends Filter3 {
	  public static class Factory
	  implements I2Factory<OilFilter3> {
	    public OilFilter3 create() { return new OilFilter3(); }
	  }
}	

class Belt3 extends Part3 {}

class FanBelt3 extends Belt3 {
	  public static class Factory
	  implements I2Factory<FanBelt3> {
	    public FanBelt3 create() { return new FanBelt3(); }
	  }
}

class GeneratorBelt3 extends Belt3 {
	  public static class Factory
	  implements I2Factory<GeneratorBelt3> {
	    public GeneratorBelt3 create() {
	      return new GeneratorBelt3();
	    }
	  }
}	

class PowerSteeringBelt3 extends Belt3 {
	  public static class Factory
	  implements I2Factory<PowerSteeringBelt3> {
	    public PowerSteeringBelt3 create() {
	      return new PowerSteeringBelt3();
	    }
	  }
}	
