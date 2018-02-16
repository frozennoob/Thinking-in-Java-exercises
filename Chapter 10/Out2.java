
public class Out2 {
	private String msg = "Out2";
	private void print(){System.out.println(msg);}
	public static void start(){
		Out2 out2 = new Out2();
		In2 in2 = out2.new In2();
		in2.in2();
		in2.printin();
		in2.inmsg = 1;
	}
	class In2{
		private int inmsg;
		public void in2(){
			msg = "Changed in inner";
			print();
		}
		private void printin(){}
	}
	
}
