
public class Frog extends Amphibian {
	void voice(String name){
		System.out.println("Frog name is  " + name);
	}
	static void hello(Amphibian amph){
		System.out.println("Hello frog");
	}
}

class Amphibian{
	void voice(String name){
		System.out.println("My name is  " + name);
	}
	static void hello(Amphibian amph){
		System.out.println("Hello");
	}
}