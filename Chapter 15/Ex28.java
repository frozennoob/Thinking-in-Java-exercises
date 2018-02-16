import java.util.*;
import typeinfo.pets.*;
// стр 555
public class Ex28<T> {
	void gen(Generic1<? super T> g, T t){
		g.generic1(t);
	}
	public static void start(){
		Ex28<Pet> ex = new Ex28();
		ex.gen(new Generic1<Pet>(), new Cat("Kitty"));
	}
}

class Generic1<T> {
	void generic1(T x){
		System.out.println(x);
	}
}

class Generic2<T>{
	T generic2(T t){
		return t;
	}
}



