import java.util.*;
public class Ex32{
	public static void start(){
		IntegerArray ia = new IntegerArray();
		ArrayList<Integer> al = new ArrayList<Integer>();
		long timeStart = System.nanoTime();
		for (int i = 0; i < 1000; i ++)
			ia.add(47);
		long time = System.nanoTime() - timeStart;
		System.out.println("IntegerArray time " + time);
		timeStart = System.nanoTime();
		for (int i = 0; i < 1000; i ++)
			al.add(47);
		time = System.nanoTime() - timeStart;
		System.out.println("ArrayList<Integer> time " + time);
	}
}

class IntegerArray{
	private int size = 0;
	private int[] ia = new int[size];
	public void add(int val) { 
		size += 1;
		int[] temp = new int[size];
		for(int i = 0; i < ia.length; i++) temp[i] =ia[i];
		temp[size - 1] = val;
		ia = temp;
	}
	public boolean remove(int index){
		if (index >= size())
			return false;
		for (int i = index; i < size() - 1; i ++)
			ia[i] = ia[i+1];
		size--;
		return true;
	}
	public int size(){
		return size;
	}
	public String toString(){
		String result = "";
		for (int i = 0; i < size(); i++)
			result = result + "[" + ia[i] + "] ";
		return result;
	}
	Integer get(int index){
		if (index >= size())
			return null;
		return ia[index];
	}
}
