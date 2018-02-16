import java.util.*;

public class Ex20 {
	public static void start(){
		Ex20_1 ex = new Ex20_1("17 56789 2,7 3,61412 hello");
		System.out.println(ex);
	}
}

class Ex20_1{
	int i = 0;
	long l = 0;
	float f = 0;
	double d = 0;
	String s;
	Ex20_1(String msg){
		Scanner s = new Scanner(msg);
		i = s.nextInt();
		l = s.nextLong();
		f = s.nextFloat();
		d = s.nextDouble();
		this.s = s.next();
	}
	public String toString(){
		return i + ", " + l + ", " + f + ", " + d +  ", " + s;
	}
}