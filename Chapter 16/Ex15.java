import java.util.*;
import net.mindview.util.*;

public class Ex15 {
	public static void start(){
		BerylliumSphere[] spheres = Generated.array(BerylliumSphere.class, 
				new BerylliumSphereCountingGenerator(), 5);

	    System.out.println(Arrays.toString(spheres));
	    System.out.println(spheres[4]);

	}
}
class BerylliumSphereCountingGenerator implements Generator<BerylliumSphere>{
	@Override
	public BerylliumSphere next() {
		return new BerylliumSphere();
	}
	
}
