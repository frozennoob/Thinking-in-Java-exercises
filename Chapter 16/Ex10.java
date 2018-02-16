import java.util.*;

public class Ex10 {
	public static void start(){
		ArrayOfGenericType<Integer> aog = new ArrayOfGenericType<Integer>(5);
	}
}

class ArrayOfGenericType<T> {
	  ArrayList <T> list; // OK
	  public ArrayOfGenericType(int size) {
	    //! array = new T[size]; // Illegal
	    list = new ArrayList(size); // "unchecked" Warning
	  }
	  // Illegal:
	  //! public <U> U[] makeArray() { return new U[10]; }
	} ///:~