
public class Extend extends Base {
	public void second(){System.out.println("Extend Second");}
	static void polym(Base base){
		base.first();
	}
	static public void start(){
		Extend ext = new Extend();
		polym(ext);
		
	}
}
