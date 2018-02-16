import java.util.*;

public class Ex1 {
	public static void start(){
		
	}
}

class Holder<T> {
	T a;
	T b;
	T c;
	Holder(T a, T b, T c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void setA(T a){
		this.a = a;
	}
	void setB(T b){
		this.b = b;
	}
	void setC(T c){
		this.c = c;
	}
	T getA(){
		return a;
	}
	T getB() {
		return b;
	}
	T getC() {
		return c;
	}
}
