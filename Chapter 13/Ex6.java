import java.util.*;

public class Ex6 {
	int i = 10;
	long l = 100;
	float f = 10.25f;
	double d = 10.90;
	String s;
	public String toString(){
		s = String.format("%d, %d, %.2f, %.2f", i, l, f, d);
		return s;
	}
	public static void start(){
		System.out.println(new Ex6());
	}
}
