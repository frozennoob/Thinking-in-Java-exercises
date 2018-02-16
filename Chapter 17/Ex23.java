import java.util.*;
public class Ex23{
	public static void start(){
		Map<String,Integer> m = new HashMap<>();
		SimpleHashMap<String,Integer> shm = new SimpleHashMap<String, Integer>();
		shm.put("Alpha", 1);
		shm.put("Beta", 2);
		shm.put("Omega", 3);;
		System.out.println(shm.containsKey("Omega"));
		System.out.println(shm.containsKey("Lambda"));
		System.out.println(shm.containsValue(1));
		System.out.println(shm.containsValue(5));
		SimpleHashMap<String,Integer> shm2 = new SimpleHashMap<String, Integer>();
		shm2.put("Alpha", 1);
		shm2.put("Beta", 2);
		shm2.put("Omega", 3);;
		System.out.println(shm.equals(shm2));
		shm2.put("Lambda", 4);
		System.out.println(shm.equals(shm2));
		System.out.println(shm.size());
		System.out.println(shm2.size());
		System.out.println(shm);
		System.out.println(shm2);
		System.out.println(shm.isEmpty());
		SimpleHashMap<String,Integer> shm3 = new SimpleHashMap<String, Integer>();
		System.out.println(shm3.isEmpty());
	}
}