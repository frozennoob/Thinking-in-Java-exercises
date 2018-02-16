import static net.mindview.util.Print.print;

public class Cell {
	private int refcount = 0;
	private static long counter = 0;
	private long id = counter++;
	public void addRef() {refcount++;}
	protected void dispose() {
		if (--refcount == 0)
			print("Disposing " + this);
	}
	public Cell(){
		print("Создаем " + this);
	}
	public String toString() {return "Cell " + id;}
}
