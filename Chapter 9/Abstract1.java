
public abstract class Abstract1 {
	abstract void print();
	Abstract1(){print();}
	static void start(){
		Abs1 abs = new Abs1();
		abs.print();
	}
}

class Abs1 extends Abstract1{
	int a = 1;
	void print(){
		System.out.println(a);
	}
}