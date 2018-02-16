import java.util.*;
public class Ex31{
	public static void start(){
		StringArray sa = new StringArray();
		for (int i = 0; i < 100; i ++)
			sa.add(((Integer)i).toString());
		System.out.println(sa);
		System.out.println(sa.size());
		System.out.println(sa.get(50));
		sa.remove(50);
		System.out.println(sa);
		for (int i = 0; i < 100; i ++)
			sa.add(((Integer)i).toString());
		System.out.println(sa);
		StringArray sa2 = new StringArray();
		ArrayList<String> al = new ArrayList<String>();
		long timeStart = System.nanoTime();
		for (int i = 0; i < 1000; i ++)
			sa2.add("str");
		long time = System.nanoTime() - timeStart;
		System.out.println("StringArray time " + time);
		timeStart = System.nanoTime();
		for (int i = 0; i < 1000; i ++)
			al.add("str");
		time = System.nanoTime() - timeStart;
		System.out.println("ArrayList<String> time " + time);
	}
}

class StringArray{
	private int size = 0;
	private String[] str = new String[size];
	public void add(String s) { 
		size += 1;
		String[] temp = new String[size];
		for(int i = 0; i < str.length; i++) temp[i] =str[i];
		temp[size - 1] = s;
		str = temp;
	}
	public boolean remove(int index){
		if (index >= size())
			return false;
		for (int i = index; i < size() - 1; i ++)
			str[i] = str[i+1];
		size--;
		return true;
	}
	public int size(){
		return size;
	}
	public String toString(){
		String result = "";
		for (int i = 0; i < size(); i++)
			result = result + "[" + str[i] + "] ";
		return result;
	}
	String get(int index){
		if (index >= size())
			return null;
		return str[index];
	}
}

