import java.util.*;

public class Ex18 {
	public static void start(){
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(0, "Zero");
		m.put(1, "First");
		m.put(2, "Second");
		m.put(3, "Third");
		m.put(555, "Ouch!");
		m.put(666, "Devils");
		System.out.println(m);
		int [] keys = new int[m.size()];
		String [] values = new String[m.size()];
		int k = 0;
		for(int i : m.keySet()){
			keys[k] = i;
			values[k] = m.get(i);
			k++;
		}
		int tmp = keys[0];
		String strtmp = values[0];
		for (int i = 0; i < keys.length - 1; i++){
			for (int n = i+1; n < keys.length; n++){
				if (keys[i] > keys[n]){
					tmp = keys[n];
					keys[n] = keys[i];
					keys[i] = tmp;
					strtmp = values[n];
					values[n] = values[i];
					values[i] = strtmp;
				}
			}
		}
		Map<Integer, String> lm = new LinkedHashMap<Integer, String>();
		for (int i = 0; i < keys.length; i++)
			lm.put(keys[i], values[i]);
		System.out.println(lm);
	}
}
