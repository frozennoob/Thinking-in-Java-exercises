import java.util.*;
public class Ex22{
	public static void start(){
		SimpleHashMap<String,Integer> shm = new SimpleHashMap<String, Integer>();
		shm.put("Alpha", 1);
		shm.put("Beta", 2);
		shm.put("Omega", 3);;
		shm.put("Alpha", 5);
		System.out.println(shm);
		shm.remove("Alpha");
		System.out.println(shm);
		shm.clear();
		System.out.println(shm);
	}
}