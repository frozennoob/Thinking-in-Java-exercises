import java.util.*;

public class Ex2 {
	public static void starrt(){
		Nuller nuller = null;
		try{
			nuller.print();
		}catch(Exception ex){
			System.out.println("No object");
		}
		
	}
}

class Nuller {
	public void print() { }
}
