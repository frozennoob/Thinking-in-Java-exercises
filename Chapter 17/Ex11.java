import java.util.*;
public class Ex11 {
	public static void start(){
		PriorityQueue<NumberPrio> np = new PriorityQueue<NumberPrio>(); 
		for (int i =0; i < 20; i++)
			np.add(new NumberPrio());
		for(int i = 0; i < np.size(); i++)
			System.out.print(np.poll() + ", ");
		System.out.println();
	}
}

class NumberPrio implements Comparable<NumberPrio>{
	private Integer val;
	public Integer getVal() {
		return val;
	}
	NumberPrio(){
		Random rnd = new Random();
		val = rnd.nextInt(100);
	}
	public int compareTo(NumberPrio nump){
		if(val > nump.getVal())
			return +1;
		if(val == nump.getVal())
			return 0;
		return -1;
	}
	public String toString(){
		return val.toString();
	}
}