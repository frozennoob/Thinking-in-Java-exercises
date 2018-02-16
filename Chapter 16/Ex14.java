import java.util.*;
import net.mindview.util.*;

public class Ex14 {
	public static void start(){
		final int size = 10;
		double [] a = ConvertTo.primitive(Generated.array(Double.class, 
				new CountingGenerator.Double(), size));
		int [] i = ConvertTo.primitive(Generated.array(Integer.class, 
				new CountingGenerator.Integer(), size));
		boolean [] b = ConvertTo.primitive(Generated.array(Boolean.class, 
				new CountingGenerator.Boolean(), size));
		char [] c = ConvertTo.primitive(Generated.array(Character.class, 
				new CountingGenerator.Character(), size));
		byte [] by = ConvertTo.primitive(Generated.array(Byte.class, 
				new CountingGenerator.Byte(), size));
		short [] s = ConvertTo.primitive(Generated.array(Short.class, 
				new CountingGenerator.Short(), size));
		long [] l = ConvertTo.primitive(Generated.array(Long.class, 
				new CountingGenerator.Long(), size));
		float [] f = ConvertTo.primitive(Generated.array(Float.class, 
				new CountingGenerator.Float(), size));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(by));
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(l));
		System.out.println(Arrays.toString(f));
	}
}
