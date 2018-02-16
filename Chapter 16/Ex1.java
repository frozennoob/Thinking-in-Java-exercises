import java.util.*;

public class Ex1 {
	public static void start(){
		bstest(new Bs[2]);
		bstest(new Bs[]{new Bs(), new Bs()});
	}
	static void bstest(Bs[] bs){
		System.out.println(Arrays.asList(bs));
	}
}

class Bs{}