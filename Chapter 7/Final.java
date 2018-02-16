
public class Final {
	static final int VAL_1 = 25;
	final int val2 = 35;
	final String val3;
	Final(){
		val3 = "Final";
	}
	Final(String val){
		val3= val;
	}
	private final void hello(){
		System.out.println("Hello Final");
	}
}

class ExtFinal extends Final{
	void hello(){
		System.out.println("Hello ExtFinal");
	}
}