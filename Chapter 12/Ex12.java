import java.util.*;


public class Ex12 {
	public static void start(){
		Sequence.start();
	}
}

class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence (int size) {items = new Object[size];}
	public void add(Object x){
		if (next < items.length)
			items[next++] = x;
		else
			throw new RuntimeException("Sequence.add() : out of index");
	}
	private class SequenceSelector implements Selector{
		private int i = 0;
		public boolean end() {return i == items.length;}
		public Object current() {return items[i];}
		public void next() { if (i < items.length) i++;}
		public Sequence up(){
			return Sequence.this;
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void start(){
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()){
			System.out.print(selector.current() + " ");
			selector.next();
		}
		Sequence seqStr = new Sequence(10);
		for (int i = 0; i < 10; i++)
			seqStr.add(new SequenceString());
		Selector selStr = seqStr.selector();
		while(!selStr.end()){
			System.out.print(selStr.current() + " ");
			selStr.next();
		}
	}
}

interface Selector{
	boolean end();
	Object current();
	void next();
}

class SequenceString{
	String msg = "F";
	public String toString(){
		return msg;
	}
}