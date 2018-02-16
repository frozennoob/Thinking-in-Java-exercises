
public class Ex24 {
	class Inner{
		private int abs;
		Inner (int a){abs = a;}
	}
	public static void start(){
		Ex24 i = new Ex24();
		Inherit.InnerInh ii = new Inherit().new InnerInh(i, 4);
	}
}
class Inherit{
	class InnerInh extends Ex24.Inner{
		InnerInh(Ex24 b, int a){
			b.super(a);
		}
	}
}
