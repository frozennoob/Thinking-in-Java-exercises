
public class Ex13 {
	public static Ex13_2 ret(){
		return Ex13_2.ret("11");
	}
}

class Ex13_2{
	Ex13_2(String msg){}
	static Ex13_2 ret(final String msg){
		return new Ex13_2(msg){
			
		};
	}
}