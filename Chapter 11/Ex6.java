import java.util.*;

public class Ex6 {
	public static void start(){
		Random rand = new Random(47);
		List<String> ints = new ArrayList<String>(Arrays.asList(
				"a", "b", "c", "d", "e", "f", "g"));
		System.out.println();
		System.out.println("1: " + ints);
		String a = "k";
		ints.add(a);
		System.out.println("2: " + ints);
		System.out.println("3: " + ints.contains(a));
		ints.remove(a);
		String i = ints.get(2);
		System.out.println("4: " + i + " " + ints.indexOf(i));
		String b = "p";
		System.out.println("5: " + ints.indexOf(b));
		System.out.println("6: " + ints.remove(b));
		System.out.println("7: " + ints.remove(i));
		System.out.println("8: " + ints);
		List<String> sub = ints.subList(1,  4);
		System.out.println("Частичный список " + sub);
		Collections.sort(sub);
		System.out.println("После сортировки " + sub);
		System.out.println("11: " + ints.containsAll(sub));
		Collections.shuffle(sub, rand);
		System.out.println("После перемешивания " + sub);
		System.out.println("12: " + ints.containsAll(sub));
		List<String> copy = new ArrayList<String>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<String>(ints);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
		copy.set(1, "w");
		System.out.println("16: " + copy);
		copy.addAll(2, sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + ints.isEmpty());
		ints.clear();
		System.out.println("19: " + ints);
		System.out.println("20: " + ints.isEmpty());
		ints.addAll(new ArrayList<String>(Arrays.asList(
				"j", "t", "r", "y")));
		System.out.println("21: " + ints);
		Object[] o = ints.toArray();
		System.out.println("22: " + o[3]);
		String [] pa = ints.toArray(new String[0]);
		System.out.println("23: " + pa);
	}
}
