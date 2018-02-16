
public class OverConstr {
	OverConstr(){
		System.out.println("1 Constructor");
	}
	OverConstr(String msg){
		this();
		System.out.println(msg);
	}
}
