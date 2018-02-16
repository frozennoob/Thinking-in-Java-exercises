import java.util.*;

public class Ex3 {
	public static void start(){
		TwoTuple<A,B> tt = new TwoTuple<A,B>(new A(), new B());
		ThreeTuple<A,B,C> tht = new ThreeTuple<A,B,C>(new A(), new B(), new C());
		FourTuple<A,B,C,D> ft = new FourTuple<A,B,C,D>(new A(), new B(), new C(), new D());
		FiveTuple<A,B,C,D,E> fvt = new FiveTuple<A,B,C,D,E>
			(new A(), new B(), new C(), new D(), new E());
		SixTuple<A,B,C,D,E,F> st = new SixTuple<A,B,C,D,E,F>
		(new A(), new B(), new C(), new D(), new E(), new F());
		System.out.println(tt + ", " + tht + ", " + ft + ", " + fvt + ", " + st);
	}
}

class A{}
class B{}
class C{}
class D{}
class E{}
class F{}
class TwoTuple<A,B>{
	public final A first;
	public final B second;
	public TwoTuple(A a, B b) { first = a; second = b;}
	public String toString(){
		return "(" + first + ", " + second + ")";
	}
}

class ThreeTuple<A,B,C> extends TwoTuple<A,B>{
	public final C third;
	public ThreeTuple (A a, B b, C c){
		super(a,b);
		third = c;
	}
	public String toString(){
		return "(" + first + ", " + second + ", "+ third + ")";
	}
}

class FourTuple<A,B,C,D> extends ThreeTuple<A,B,C>{
	public final D fourth;
	public FourTuple (A a, B b, C c, D d){
		super(a,b,c);
		fourth = d;
	}
	public String toString(){
		return "(" + first + ", " + second + ", "+ third + ",  " + fourth + ")";
	}
}

class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D>{
	public final E fifth;
	public FiveTuple (A a, B b, C c, D d, E e){
		super(a,b,c,d);
		fifth = e;
	}
	public String toString(){
		return "(" + first + ", " + second + ", "+ third + ",  " + fourth + ", "+ fifth + ")";
	}
}

class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E>{
	public final F sixth;
	public SixTuple (A a, B b, C c, D d, E e, F f){
		super(a,b,c,d,e);
		sixth = f;
	}
	public String toString(){
		return "(" + first + ", " + second + ", "+ third + ",  " + fourth + ", "+ 
	fifth + ", " + sixth + ")";
	}
}