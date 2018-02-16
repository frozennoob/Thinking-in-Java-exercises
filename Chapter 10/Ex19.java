
public class Ex19 implements Ex19Int {
	public void print(){
		System.out.println("Int19");
	}
	public static void start(){
		Ex19IntInner.go(new Ex19());
	}
}

interface Ex19Int{
	void print();
	public class Ex19IntInner{
		public static void go(Ex19Int ex19int){
			ex19int.print();
		}
	}
}