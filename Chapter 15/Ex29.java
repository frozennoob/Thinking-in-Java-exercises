import java.util.*;
//стр 562

public class Ex29 {
	void hold(Holder<List<?>> h){
		System.out.println(h.getA().size());
		System.out.println(h.getA().getClass());
		
	}
	void hold2(List<Holder<?>> h){
		h.add(0, new Holder<Integer>(1,2,3));
		System.out.println(h.get(0).getB());
	}
	public static void start(){
		Ex29 ex = new Ex29();
		Holder<List<?>> holder = new Holder<List<?>>(
				new ArrayList<Integer>(),
				new ArrayList<Integer>(),
				new ArrayList<Integer>());
		ex.hold(holder);
		List<Holder<?>> holder2 = new ArrayList<Holder<?>>();
		ex.hold2(holder2);
	}
}
