import java.util.*;
import net.mindview.util.*;

public class Ex18 {
	public static void start(){
		BerylliumSphere[] spheres = Generated.array(BerylliumSphere.class, 
				new BerylliumSphereCountingGenerator(), 5);
	    System.out.println(Arrays.toString(spheres));
	    BerylliumSphere[] spheres2 = new BerylliumSphere[5];
		System.arraycopy(spheres, 0, spheres2, 0, spheres.length);
		System.out.println(Arrays.toString(spheres2));
		spheres = Generated.array(BerylliumSphere.class, 
				new BerylliumSphereCountingGenerator(), 5);
		System.out.println(Arrays.toString(spheres));
		System.out.println(Arrays.toString(spheres2));
	}
}
