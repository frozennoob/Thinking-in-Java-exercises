import java.util.*;

public class Ex2 {
	public static void start(){
		System.out.println(Arrays.toString(test(4)));
	}
	static Bs2[] test(int size){
		Bs2[] bs = new Bs2[size];
		for (int i = 0; i < size; i++){
			bs[i] = new Bs2();
		}
		return bs;
	}
}

class Bs2{}