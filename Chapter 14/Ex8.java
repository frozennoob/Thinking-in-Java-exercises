import java.lang.reflect.Field;
import java.util.*;

public class Ex8 {
	public static void start(){
		info(new C());
	}
	static void info(Object o){
		System.out.println(o.getClass());
		for (Field f: o.getClass().getDeclaredFields())
			System.out.print("(" + f + ") ");
		System.out.println();
		if (o.getClass().getSuperclass() != null)
			info2(o.getClass().getSuperclass());
	}
	static void info2(Class c){
		System.out.println(c);
		for (Field f: c.getDeclaredFields())
			System.out.print("(" + f + ") ");
		System.out.println();
		if (c.getSuperclass() != null)
			info2(c.getSuperclass());
	}
}

class A{
	double g;
	float n;
}
class B extends A{
	int d;
	String s;
	boolean f;
}
class C extends B{
	int a;
}