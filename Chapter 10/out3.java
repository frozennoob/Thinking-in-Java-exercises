
public class out3{
	public static out3int create(){
		class In3 implements out3int{
			public void print(){System.out.println("In3");}
		}
		
	}
	private class In4 implements out3int{
		public void print(){System.out.println("In4");}
	}
	public static out3int create2(){
		out3 o3 = new out3();
		In4 in4 = o3.new In4();
		return in4;
	}
	public static void start(){
		In4 in4 = (In4) out3.create2();
	}
}

interface out3int{
	void print();
}