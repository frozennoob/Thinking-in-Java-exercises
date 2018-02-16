
public interface Interface2 {
	void print2();
}

interface Interface3 extends Interface2{
	void print3();
}

interface Interface4 extends Interface2, Interface3 {
	void print4();
}