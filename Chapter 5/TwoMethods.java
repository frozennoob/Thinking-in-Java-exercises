
public class TwoMethods {
	void stMsg(){
		System.out.println("Hello");
	}
	void userMsg(String msg){
		stMsg();
		this.stMsg();
		System.out.println(msg);
	}
}
