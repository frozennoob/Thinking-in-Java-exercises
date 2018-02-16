import java.util.*;

public class Ex5 {
	public static void start(){
		Random rand = new Random(47);
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		System.out.println();
		System.out.println("1: " + ints);
		Integer a = 1;
		ints.add(a);
		System.out.println("2: " + ints);
		System.out.println("3: " + ints.contains(a));
		ints.remove(a);
		Integer i = ints.get(2);
		System.out.println("4: " + i + " " + ints.indexOf(i));
		Integer b = 3;
		System.out.println("5: " + ints.indexOf(b));
		System.out.println("6: " + ints.remove(b));
		System.out.println("7: " + ints.remove(i));
		System.out.println("8: " + ints);
		List<Integer> sub = ints.subList(1,  4);
		System.out.println("Частичный список " + sub);
		Collections.sort(sub);
		System.out.println("После сортировки " + sub);
		System.out.println("11: " + ints.containsAll(sub));
		Collections.shuffle(sub, rand);
		System.out.println("После перемешивания " + sub);
		System.out.println("12: " + ints.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(ints);
		sub = Arrays.asList(ints.get(1), ints.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(ints);
		copy.remove(2);
		System.out.println("14: " + copy);
		copy.removeAll(sub);
		System.out.println("15: " + copy);
		copy.set(1, 6);
		System.out.println("16: " + copy);
		copy.addAll(2, sub);
		System.out.println("17: " + copy);
		System.out.println("18: " + ints.isEmpty());
		ints.clear();
		System.out.println("19: " + ints);
		System.out.println("20: " + ints.isEmpty());
		ints.addAll(new ArrayList<Integer>(Arrays.asList(7,8,9,10)));
		System.out.println("21: " + ints);
		Object[] o = ints.toArray();
		System.out.println("22: " + o[3]);
		Integer [] pa = ints.toArray(new Integer[0]);
		System.out.println("23: " + pa);
	}
}
