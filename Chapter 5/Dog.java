
public class Dog {
	public void bark(){
		System.out.println("Гав-гав");
	}
	public void bark(String msg, int times){
		for (int i = 0; i < times; i++)
			System.out.println(msg);
	}
	public void bark(int times, String msg){
		for (int i = 0; i < times; i++)
			System.out.println(times + msg);
	}
}
