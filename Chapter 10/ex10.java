
public class ex10 {
	public Int10 int10(){
		return new Int10(){
			public void print(){}
		};
	}
	public static void start(){
		ex10 ex = new ex10();
		Int10 int_10 = ex.int10();
	}
}

interface Int10 {
	void print();
}