import static net.mindview.util.Print.*;

public class ReferenceCounting {
	public static void start(){
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared),
				new Composing(shared),new Composing(shared),
				new Composing(shared),new Composing(shared)};
		for (Composing c : composing)
			c.dispose();
		}
}

class Shared{
	private int refcount = 0;
	private static long counter = 0;
	private long id = counter++;
	public Shared(){
		print("Создаем " + this);
	}
	public void addRef() {refcount++;}
	protected void dispose() {
		if (--refcount == 0)
			print("Disposing " + this);
	}
	public String toString() {return "Shared " + id;}
	protected void finalize(){
		if (refcount > 0)
			refcount--;
	}
}
class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared){
		print("Создаем " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose(){
		print("disposing " + this);
		shared.dispose();
	}
	public String toString() {return "Composing " + id;}
}