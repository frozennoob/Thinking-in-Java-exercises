import java.util.*;
// стр 574
public class Ex34 {
	public static void start(){
		Sb2 sb = new Sb2();
		System.out.println(sb.f2(new Sb2()));
		D2 d = new D2();
		d.f(d).g(d);
	}
}

abstract class Sb<T extends Sb<T>>{
	abstract <T extends Sb<T>> T f(T arg);
	<T extends Sb<T>> T f2 (T arg){
		return f(arg);
	}
}

class Sb2 extends Sb{
	Sb f(Sb arg) {
		return arg;
	}
	
}

abstract class SelfBoundedType<T extends SelfBoundedType<T>> {
	abstract T f(T arg);
	T g(T arg) { 
		System.out.println("g(T arg)");
		return f(arg); 
	}	
}

class D2 extends SelfBoundedType<D2> {
	D2 f(D2 arg) { 
		System.out.println("f(D2 arg)");
		return arg; 
	}	
}