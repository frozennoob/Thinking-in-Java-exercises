import java.util.*;

public class Ex7 {
	public static void start(){
		for(int i : new IterableFibonacci(18))
		      System.out.print(i + " ");
	}
}

class Fibonacci implements Generator<Integer> {
	  private int count = 0;
	  public Integer next() { return fib(count++); }
	  private int fib(int n) {
	    if(n < 2) return 1;
	    return fib(n-2) + fib(n-1);
	  }
}

class IterableFibonacci implements Iterable<Integer> {
	private Fibonacci fb = new Fibonacci();
	private int n;
  public IterableFibonacci(int count) { n = count; }
  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public boolean hasNext() { return n > 0; }
      public Integer next() {
        n--;
        return fb.next();
      }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }	
}