import java.math.*;
import java.util.concurrent.atomic.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class Ex42 {
	public static <T,U> U
	reduce(Iterable<T> seq, Combiner<T,U> combiner) {
	 Iterator<T> it = seq.iterator();
	 U res = null;
	 if(it.hasNext()) {
	   T result = it.next();
	   while(it.hasNext())
	     res = combiner.combine(result, it.next());
	   return res;
	 }

	 return null; 
	}



	static class FuncCombiner implements Combiner<Func,Integer> {
	 public Integer combine(Func x, Func y) {
	   return x.getA() + y.getA();
	 }
	}
	
	 public static void start(){
		 Func1 f1 = new Func1();
		 Func2 f2 = new Func2();
		 f1.setA(123);
		 f2.setA(22);
		 List<Func> lo = Arrays.asList(f1, f2);
		 Integer result = reduce(lo, new FuncCombiner());
		 print(result);

	 }
}


interface Combiner<T,U> { U combine(T x, T y); }
interface UnaryFunction<R,T> { R function(T x); }
interface Collector<T> extends UnaryFunction<T,T> {
T result();
}
interface UnaryPredicate<T> { boolean test(T x); }

interface Func {
	int getA();
	void setA(int a);
}
class Func1 implements Func{
	int a;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
class Func2 implements Func{
	int a;

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}