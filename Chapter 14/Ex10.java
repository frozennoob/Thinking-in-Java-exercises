import java.util.*;

public class Ex10 {
	public static void start(){
		Class c = char[].class;
		System.out.println(c.getName());
		char[] a = new char[10];
		// c is an Object:		
		System.out.println("Superclass of char[] c: " + 
			a.getClass().getSuperclass());
		System.out.println("char[] c instanceof Object: " + 
			(a instanceof Object));
	}
}
