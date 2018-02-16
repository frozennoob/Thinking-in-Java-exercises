
public class Outer {
	private String msg;
	Outer(){msg = "Outer msg";}
	class Inner{
		public String toString(){
			return msg;
		}
	}
	public Inner in(){
		return new Inner();
	}
	public static void start(){
		Outer out = new Outer();
		Outer.Inner in = out.in();
		System.out.println(in);
	}
}
