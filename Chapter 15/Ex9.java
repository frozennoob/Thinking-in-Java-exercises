import java.util.*;

public class Ex9 {
	public <T,U> void f(T x, U y, int z) {
	    System.out.println(x.getClass().getName());
	    System.out.println(y.getClass().getName());
	  }
	public static void start(){
		Ex9 gm = new Ex9();
	    gm.f("", 1 , 2);
	    gm.f(1, 1.123, 2);
	    gm.f(gm, 1, 3);
	}
}
