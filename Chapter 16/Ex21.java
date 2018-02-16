// cтр 631
import java.util.*;

import net.mindview.util.Generated;

public class Ex21 {
	public static void start(){
		BerylliumSphere[] spheres = Generated.array(BerylliumSphere.class, 
				new BerylliumSphereCountingGenerator(), 5);
		System.out.println(Arrays.toString(spheres));
		BerylliumSphere tmp = spheres[2];
		spheres[2] = spheres[3];
		spheres[3] = tmp;
		System.out.println(Arrays.toString(spheres));
		Arrays.sort(spheres);
		System.out.println(Arrays.toString(spheres));
		Arrays.sort(spheres,new BsReverseComp());
		System.out.println(Arrays.toString(spheres));
	}
}

class BsReverseComp implements Comparator<BerylliumSphere>{
	@Override
	public int compare(BerylliumSphere o1, BerylliumSphere o2) {
		if (o1.compareTo(o2) > 0)
			return -1;
		if (o1.compareTo(o2) == 0)
			return 0;
		return 1;
	}
	
}