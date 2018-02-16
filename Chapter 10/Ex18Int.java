
public interface Ex18Int {
	void print();
	class Test_Ex18Int implements Ex18Int{
		public void print(){
			System.out.println("Int18");
		}
		public static void main(String[] args){
			new Test_Ex18Int().print();
		}
	}
}
