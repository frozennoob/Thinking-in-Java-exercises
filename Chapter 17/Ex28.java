import java.util.*;
import static net.mindview.util.Print.*;
public class Ex28 {
	public static void start() {
		Tuple t = new Tuple();
		FiveTuple t1b = t.tuple(1,1,1,1,1);
		FiveTuple t2b = t.tuple(1,1,1,2,1);
		FiveTuple t3b = t.tuple(1,1,1,1,1);
		FiveTuple t4b = t.tuple(1,1,1,1,0);
		print(t1b.compareTo(t1b));
		print(t1b.compareTo(t2b));
		print(t1b.compareTo(t3b));
		print(t1b.compareTo(t4b));
		List<FiveTuple> list = 
			new ArrayList<FiveTuple>(Arrays.asList(t1b,t2b,t3b,t4b));
		Set<FiveTuple> s = new TreeSet<FiveTuple>();
		s.addAll(list);
		print(s);
	}
}

class Tuple {
	public static <A, B> TwoTuple<A, B> tuple(A a, B b) {
		return new TwoTuple<A, B>(a, b);
	}
	public static <A, B, C> ThreeTuple<A, B, C> tuple(A a, B b, C c) {
		return new ThreeTuple<A, B, C>(a, b, c);
	}
	public static <A, B, C, D> FourTuple<A, B, C, D> tuple(A a, B b, C c, D d) {
		return new FourTuple<A, B, C, D>(a, b, c, d);
	}
	public static <A, B, C, D, E> FiveTuple<A, B, C, D, E> tuple(A a, B b, C c, D d, E e) {
		return new FiveTuple<A, B, C, D, E>(a, b, c, d, e);
	}
}

class TwoTuple<A, B> implements Comparable{
	public final A first;
	public final B second;
	public TwoTuple(A a, B b) {
		first = a;
		second = b;
	}
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	public int hashCode() {
	    int result = 17;
	    result = 37 * result + first.hashCode();
	    result = 37 * result + second.hashCode();
	    return result;
	  }
	public boolean equals(Object o) {
	    return o instanceof TwoTuple &&
	      first.equals(((TwoTuple)o).first) &&
	      second.equals(((TwoTuple)o).second);
	  }
	@Override
	public int compareTo(Object o) {
		if(!(o instanceof TwoTuple)) throw new ClassCastException();
		if (hashCode() > ((TwoTuple)o).hashCode())
			return 1;
		if (hashCode() < ((TwoTuple)o).hashCode())
			return -1;
		return 0;
	}
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
	public final C third;
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		third = c;
	}
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ")";
	}
	public int hashCode() {
		int result = super.hashCode();
		result = result * 37 + third.hashCode();
		return result;
	}
	public boolean equals(Object o) {
		return o instanceof ThreeTuple &&
		((ThreeTuple)o).first.equals(first) &&
		((ThreeTuple)o).second.equals(second) &&
		((ThreeTuple)o).third.equals(third); 
	}
	public int compareTo(Object o) {
		if(!(o instanceof ThreeTuple)) throw new ClassCastException();
		ThreeTuple t = (ThreeTuple)o;
		return (this.hashCode() - t.hashCode() < 0) ? -1 : 
		((this.hashCode() - t.hashCode() > 0 ? 1 : 0));
	}
}

class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C>{
	public final D fourth;
	public FourTuple(A a, B b, C c, D d) {
		super(a, b, c);
		fourth = d;
	}
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " + fourth + ")";
	}
	public int hashCode() {
		int result = super.hashCode();
		result = result * 37 + fourth.hashCode();
		return result;
	}
	public boolean equals(Object o) {
		return o instanceof FourTuple &&
		((FourTuple)o).first.equals(first) &&
		((FourTuple)o).second.equals(second) &&
		((FourTuple)o).third.equals(third) &&
		((FourTuple)o).fourth.equals(fourth);
	}
	public int compareTo(Object o) {
		if(!(o instanceof FourTuple)) throw new ClassCastException();
		FourTuple t = (FourTuple)o;
		return (this.hashCode() - t.hashCode() < 0) ? -1 : 
		((this.hashCode() - t.hashCode() > 0 ? 1 : 0));
	}
}

class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D>{
	public final E fifth;
	public FiveTuple(A a, B b, C c, D d, E e) {
		super(a, b, c, d);
		fifth = e;
	}
	public int hashCode() {
		int result = super.hashCode();
		result = result * 37 + fifth.hashCode();
		return result;
	}
	public boolean equals(Object o) {
		return o instanceof FiveTuple &&
		((FiveTuple)o).first.equals(first) &&
		((FiveTuple)o).second.equals(second) &&
		((FiveTuple)o).third.equals(third) &&
		((FiveTuple)o).fourth.equals(fourth) &&
		((FiveTuple)o).fifth.equals(fifth);
	}
	public int compareTo(Object o) {
		if(!(o instanceof FiveTuple)) throw new ClassCastException();
		FiveTuple t = (FiveTuple)o;
		return (this.hashCode() - t.hashCode() < 0) ? -1 : 
		((this.hashCode() - t.hashCode() > 0 ? 1 : 0));
	}
	public String toString() {
		return "(" + first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + ")";
	}
}