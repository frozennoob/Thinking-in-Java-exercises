import java.util.*;

public class Ex30 {
	public static void start(){
		Holder<Integer> i = new Holder<Integer>(2,3,4);
		Holder<Double> d = new Holder<Double>(1.5,1.709,2.763);
		Holder<Float> f = new Holder<Float>(1.123f,1.909f,3.09f);
		Holder<Character> c = new Holder<Character>('a','b','c');
		int i2 = i.getA();
		double d2 = d.getA();
		float f2 = f.getA();
		char c2 = c.getA();
		i.setA(i2);
	}
}
