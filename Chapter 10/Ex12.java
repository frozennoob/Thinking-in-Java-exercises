
public class Ex12 {
	public static void start(){
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		B b = new B();
		b.setU(a1.a());
		b.setU(a2.a());
		b.setU(a3.a());
		b.setU(a4.a());
		b.go();
		b.reset(1);
		b.reset(3);
		b.go();
	}
}

interface U{
	void a();
	void b();
	void c();
}

class A{
	public static U a(){
		U u = new U(){
			public void a(){System.out.println("a");}
			public void b(){System.out.println("b");}
			public void c(){System.out.println("c");}
		};
		return u;
	}
}

class B{
	U u [] = new U[4];
	int next = 0;
	public void setU(U u){
		this.u[next] = u;
		next++;
	}
	public void reset(int a){
		u[a] = null;
	}
	public void go(){
		for (U i : u) {
			if (i != null){
				i.a();
				i.b();
				i.c();
			}
		}
	}
}