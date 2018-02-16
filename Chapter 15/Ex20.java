import java.util.*;

public class Ex20 {
	public static void start(){
		Ex20Cl2 cl2 = new Ex20Cl2();
		cl2.m1(new Ex20Cl());
	}
}

interface Ex20Int{
	void msg();
	void msg2();
}

class Ex20Cl implements Ex20Int{
	public void msg(){
		System.out.println("Msg");
	}
	public void msg2(){
		System.out.println("Msg2");
	}
	public void msg3(){
		System.out.println("Msg3");
	}
}

class Ex20Cl2<T extends Ex20Int> {
	void m1 (T m){
		m.msg();
		m.msg2();
	}
}