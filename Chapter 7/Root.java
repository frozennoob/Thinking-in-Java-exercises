
public class Root {
	Component1 comp1;
	Component2 comp2;
	Component3 comp3;
	Root(int a,int b,int c){
		comp1 = new Component1(a);
		comp2 = new Component2(b);
		comp3 = new Component3(c);
		System.out.println("Root constructor");
	}
	void dispose(){
		System.out.println("Root finalize ");
		comp1.dispose();
		comp2.dispose();
		comp3.dispose();
	}
}
class Component1{
	Component1(int i){
		System.out.println("Component 1 constructor " + i);
	}
	void dispose(){
		System.out.println("Component 1 finalize ");
	}
}
class Component2{
	Component2(int i){
		System.out.println("Component 2 constructor " + i);
	}
	void dispose(){
		System.out.println("Component 2 finalize ");
	}
}
class Component3{
	Component3(int i){
		System.out.println("Component 3 constructor " + i);
	}
	void dispose(){
		System.out.println("Component 3 finalize ");
	}
}
