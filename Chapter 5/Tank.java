
public class Tank {
	boolean full = false;
	Tank(){
		full = true;
	}
	public void finalize(){
		if (full)
			System.out.println("Error: Tank is full");
	}
}
