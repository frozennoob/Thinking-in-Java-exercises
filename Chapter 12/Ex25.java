import java.util.*;

public class Ex25 {
	public static void start(){
		A ex = new C();
		try{
			ex.f();
		} catch (Ex25Exc1 e) {
			System.out.println(e);
		}
	}
}

class A {
	void f() throws Ex25Exc1 {
		throw new Ex25Exc1();
	}
}

class B extends A {
	void f() throws Ex25Exc2{
		throw new Ex25Exc2(); 
	}
}

class C extends B {
	void f() throws Ex25Exc3{
		throw new Ex25Exc3(); 
	}
}

class Ex25Exc1 extends Exception {}
class Ex25Exc2 extends Ex25Exc1 {}
class Ex25Exc3 extends Ex25Exc2 {}