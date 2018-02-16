import java.util.*;

public class Ex23 {
	public static void start(){
		new Foo2<Integer,String>(new IntegerFactory(), "HEr");
	    new Foo2<Widget,String>(new Widget.Factory(), "HIS");
	}
}

interface FactoryI<T, U> {
	  T create(U arg);
	}

	class Foo2<T, U> {
	  private T x;
	  public <F extends FactoryI<T, U>> Foo2(F factory, U arg) {
	    x = factory.create(arg);
	  }
	  // ...
	}

	class IntegerFactory implements FactoryI<Integer, String> {
	  public Integer create(String arg) {
		  System.out.println(arg);
	    return new Integer(0);
	  }
	}	

	class Widget {
	  public static class Factory implements FactoryI<Widget,String> {
	    public Widget create(String arg) {
	    	System.out.println(arg);
	      return new Widget();
	    }
	  }
	}