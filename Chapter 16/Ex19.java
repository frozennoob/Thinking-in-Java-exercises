import java.util.*;

public class Ex19 {
	public static void start(){
		AeTest[] aet = new AeTest[5];
		AeTest[] aet2 = new AeTest[5];
		int i = 0;
		Arrays.fill(aet, new AeTest(i));
		Arrays.fill(aet2, new AeTest(i));
		System.out.println(Arrays.toString(aet));
		System.out.println(Arrays.toString(aet2));
		System.out.println(Arrays.equals(aet, aet2));
		AeTest aet3 = new AeTest(1);
		AeTest[] aet4 = new AeTest[5];
		for (int j = 0; j < aet4.length; j ++)
			aet4[j] = new AeTest(j);
		System.out.println("AeTest search "  + Arrays.binarySearch(aet4, aet3));
	}
}

class AeTest implements Comparable{
	private Integer i = 0;
	AeTest(int i) {this.i = i;}
	public String toString(){
		return i.toString();
	}
	public int Geti(){
		return i;
	}
	public boolean equals(Object aet){
		return (aet.getClass().getSimpleName() == "AeTest" 
				&& this.i == ((AeTest)aet).i) ? true : false;
	}
	public int compareTo(Object o) {
		if ( i > (((AeTest)o).Geti()))
			return 1;
		if ( i == (((AeTest)o).Geti()))
			return 0;
		return -1;
	}
	
}

