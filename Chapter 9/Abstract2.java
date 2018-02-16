import interfacePack_1.Interface1;

public abstract class Abstract2 {
	abstract void print();
	static void start(){
		Abstract2 abs2 = new Abs2();
		((Abs2)abs2).print();
		abs2.print();
	}
}

class Abs2 extends Abstract2{
	void print(){System.out.println("Abstract 2 print");}
	static void base(Abstract2 abs){}
}
class Interf1 implements Interface1{
	public void print(){}
	public void print(String msg){}
	public void print2(){}
}