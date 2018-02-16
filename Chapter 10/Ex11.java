
public class Ex11 {
	public Int11 int11(){
		return new Int11(){
			public void print(){}
		};
	}
}

interface Int11{
	void print();
}