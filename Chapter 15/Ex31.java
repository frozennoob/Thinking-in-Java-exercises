import java.util.*;

public class Ex31 {
	public static final int SIZE = 10;
	public static void start(){
		FixedSizeStack<String> strings =
			      new FixedSizeStack<String>();
			    for(String s : "A B C D E F G H I J K L".split(" "))
			      strings.push(s);
			    for(int i = 0; i < strings.lenght(); i++) {
			      String s = strings.pop(i);
			      System.out.print(s + " ");
			    }
	}
}

class FixedSizeStack<T> {
	  private int index = 0;
	  private List<Object> storage = new ArrayList<Object>();;
	  public void push(T item) { storage.add(item); }
	  @SuppressWarnings("unchecked")
	  public T pop(int index) { return (T)storage.get(index); }
	  public int lenght() {return storage.size();}
	}	


interface Payable{}
class Employee implements Payable{}
class Hourly extends Employee
	implements Payable{}