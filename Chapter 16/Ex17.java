// стр 624
import java.util.*;
import net.mindview.util.*;

public class Ex17 {
	public static void start(){
		BigDecimal [] bd = Generated.array(BigDecimal.class, 
				new BDGenerator(), 10);
		System.out.println(Arrays.toString(bd));
	}
}

class BDGenerator implements Generator<BigDecimal>{

	@Override
	public BigDecimal next() {
		BigDecimal bd = new BigDecimal(i,d);
		i += 1;
		d += 0.1;
		return bd;
	}
	private static int i = 0;
	private static double d = 0.0;
}

class BigDecimal{
	BigDecimal(int i, double d) {
		this.i = i;
		this.d = d;
	}
	public String toString(){
		Double tmp = i + d;
		return tmp.toString();
	}
	Integer i;
	Double d;
}